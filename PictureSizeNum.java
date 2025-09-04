package Silver01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class PictureSizeNum {
	
	static int[] dx = {-1,0,1,0};
	static int[] dy = {0,1,0,-1};
	static int n;
	static int m;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = br.readLine().split(" ");
		n = Integer.parseInt(str[0]);
		m = Integer.parseInt(str[1]);
		int[][] paper = new int[n][m];
		boolean[][] visited = new boolean[n][m];
		
		for(int i=0; i<n; i++) {
			String[] color = br.readLine().split(" ");
			for(int j=0; j<m; j++) {
				paper[i][j] = Integer.parseInt(color[j]);
			}
		}
		
		int pictureCount = 0;
		int max = 0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(paper[i][j]==1 && !visited[i][j]) {
					pictureCount++;
					max = Math.max(max, bfs(paper,visited,i,j));
				}
			}
		}
		System.out.println(pictureCount+"\n"+max);
	}

	static int bfs(int[][] paper, boolean[][] visited, int x, int y) {
		Queue<int[]> queue = new LinkedList<>();
		visited[x][y] = true;
		queue.add(new int[]{x,y});
		int pictureSize = 1;
		
		while(!queue.isEmpty()) {
			int[] current = queue.poll();
			int cx = current[0];
			int cy = current[1];
			
			for(int i=0; i<4; i++) {
				int nx = cx + dx[i];
				int ny = cy + dy[i];
				
				if(nx>=0 && nx<n && ny>=0 && ny<m && !visited[nx][ny] && paper[nx][ny]==1) {
					queue.add(new int[] {nx,ny});
					visited[nx][ny] = true;
					pictureSize++;
				}
			}
		}
		return pictureSize;
	}
	
}
