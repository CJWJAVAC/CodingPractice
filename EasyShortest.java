package Silver01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class EasyShortest {
	
	static int[] x = {0,1,0,-1};
	static int[] y = {1,0,-1,0};
	static int[][] land;
	static boolean[][] visited;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String[] size = br.readLine().split(" ");
		int n = Integer.parseInt(size[0]);
		int m = Integer.parseInt(size[1]);
		int[][] map = new int[n][m];
		land = new int[n][m];
		visited = new boolean[n][m];
		
		for(int i=0; i<n; i++) {
			String[] str = br.readLine().split(" ");
			for(int j=0; j<m; j++) {
				map[i][j] = Integer.parseInt(str[j]);
			}
		}
		
		int cx = 0;
		int cy = 0;
		outerLoop:
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(map[i][j]==2) {
					cx = i;
					cy = j;
					break outerLoop;
				}
			}
		}
		
		land[cx][cy] = 0;
		visited[cx][cy] = true;
		
		bfs(map,cx,cy,n,m);
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				sb.append(land[i][j]+" ");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}

	static void bfs(int[][] map, int cx, int cy, int n, int m) {
		Queue<int[]> queue = new LinkedList<>();
		queue.add(new int[] {cx,cy});
		
		while(!queue.isEmpty()) {
			int[] next = queue.poll();
			int dx = next[0];
			int dy = next[1];
			
			for(int i=0; i<4; i++) {
				int nx = dx+x[i];
				int ny = dy+y[i];
				
				if(nx>=0 && nx<n && ny>=0 && ny<m && !visited[nx][ny] && map[nx][ny]==0) {
					land[nx][ny] = 0;
					visited[nx][ny] = true;
					continue;
				}
				
				if(nx>=0 && nx<n && ny>=0 && ny<m && !visited[nx][ny] && map[cx][cy]!=0) {
					land[nx][ny] = land[dx][dy] + 1;
					visited[nx][ny] = true;
					queue.add(new int[] {nx,ny});
				}
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(!visited[i][j]) {
					if(map[i][j]!=0) {
						land[i][j] = -1;
					}
					else {
						land[i][j] = 0;
					}
				}
			}
		}
	}
	
}
