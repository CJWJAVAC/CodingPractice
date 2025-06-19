package Silver02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IWantFriend {
	
	static int[] dx = {1,0,-1,0};
	static int[] dy = {0,1,0,-1};
	static int count = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] campus = br.readLine().split(" ");
		int n = Integer.parseInt(campus[0]);
		int m = Integer.parseInt(campus[1]);
		
		String[][] info = new String[n][m];
		
		for(int i=0; i<n; i++) {
			String str = br.readLine();
			for(int j=0; j<m; j++) {
				info[i][j] = String.valueOf(str.charAt(j));
			}
		}
		
		int startX = 0;
		int startY = 0;
		boolean flag = false;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(info[i][j].equals("I")) {
					startX = i;
					startY = j;
					flag = true;
					break;
				}
			}
			if(flag) break;
		}
		boolean[][] visited = new boolean[n][m];
		dfs(info,startX,startY,visited,n,m);
		
		if(count>0) {
			System.out.println(count);
		}else {
			System.out.println("TT");
		}
	}
	
	static void dfs(String[][] info, int startX, int startY, boolean[][] visited, int n, int m) {
		visited[startX][startY] = true;
		if(info[startX][startY].equals("P")) count+=1;
		
		for(int i=0; i<4; i++) {
			int nx = startX + dx[i];
			int ny = startY + dy[i];
			
			if(nx>=0 && nx<n && ny>=0 && ny<m && !visited[nx][ny] && !info[nx][ny].equals("X")) {
				dfs(info,nx,ny,visited,n,m);
			}
		}
	}
}
