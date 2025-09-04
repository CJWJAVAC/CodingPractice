package Silver01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SafeArea {
	
	static int n;
	static int[] dx = {-1,0,1,0};
	static int[] dy = {0,1,0,-1};

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		int[][] area = new int[n][n];
		int max = 0;
		
		
		for(int i=0; i<n; i++) {
			String str = br.readLine();
			String[] s = str.split(" ");
			for(int j=0; j<n; j++) {
				area[i][j] = Integer.parseInt(s[j]);
				if(area[i][j]>max) {
					max = area[i][j];
				}
			}
		}
		
		int result = 0;
		for(int i=0; i<=max; i++) {
			result = Math.max(result, safeArea(area,i));
		}
		
		System.out.println(result);
	}

	static int safeArea(int[][] area, int flood) {
		boolean[][] visited = new boolean[n][n];
		int count = 0;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(!visited[i][j] && area[i][j]>flood) {
					dfs(area,visited,i,j,flood);
					count++;
				}
			}
		}
		return count;
	}
	
	static void dfs(int[][] area, boolean[][] visited, int x, int y, int flood) {
		visited[x][y] = true;
		
		for(int i=0; i<4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if(nx<n && nx>=0 && ny<n && ny>=0 && !visited[nx][ny] && area[nx][ny]>flood) {
				dfs(area,visited,nx,ny,flood);
			}
		}
	}
	
}
