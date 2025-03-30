package Silver01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;


public class MazeExplore {
	
	static int[] cx = {0,1,0,-1};
	static int[] cy = {1,0,-1,0};
	static int n,m;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = br.readLine().split(" ");
		n = Integer.parseInt(str[0]);
		m = Integer.parseInt(str[1]);
		
		int[][] maze = new int[n][m];
		int[][] distance = new int[n][m];
		boolean[][] visited = new boolean[n][m];
		
		for(int i=0; i<n; i++) {
			Arrays.fill(distance[i], 0);
		}
		
		for(int i=0; i<n; i++) {
			String[] s = br.readLine().split("");
			for(int j=0; j<m; j++) {
				maze[i][j] = Integer.parseInt(s[j]);
			}
		}
		
		mazeFind(distance,maze,visited,0,0);
		
		System.out.println(distance[n-1][m-1]);
	}

	static void mazeFind(int[][] distance, int[][] maze, boolean[][] visited, int startY, int startX) {
		Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{startY, startX});
        visited[startY][startX] = true;
        distance[startY][startX] = 1;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int y = current[0];
            int x = current[1];

            for (int i = 0; i < 4; i++) {
                int nx = x + cx[i];
                int ny = y + cy[i];

                if (nx >= 0 && nx < m && ny >= 0 && ny < n && maze[ny][nx] == 1 && !visited[ny][nx]) {
                    queue.add(new int[]{ny, nx});
                    visited[ny][nx] = true;
                    distance[ny][nx] = distance[y][x] + 1;
                }
            }
        }
		
	}
	
}
