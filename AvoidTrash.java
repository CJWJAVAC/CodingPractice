package Silver01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AvoidTrash {

	static int n,m,k;
	static int[] dx = {1,0,-1,0};
	static int[] dy = {0,1,0,-1};
	static boolean[][] visited;
	static int size = 1;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = br.readLine().split(" ");
		n = Integer.parseInt(str[0]);
		m = Integer.parseInt(str[1]);
		k = Integer.parseInt(str[2]);
		
		int[][] trash = new int[n+1][m+1];
		visited = new boolean[n+1][m+1];
		
		for(int i=0; i<k; i++) {
			String[] str2 = br.readLine().split(" ");
			int r = Integer.parseInt(str2[0]);
			int c = Integer.parseInt(str2[1]);
			trash[r][c] = 1;
		}
		
		int max = 0;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=m; j++) {
				if(trash[i][j]==1 && !visited[i][j]) {
					maxTrash(trash,i,j);
					max = Math.max(max, size);
				}
				size = 1;
			}
		}
		System.out.println(max);
	}

	static void maxTrash(int[][] trash, int x, int y) {
		visited[x][y] = true;
		for(int i=0; i<4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
				
			if(nx <= n && nx > 0 && ny <= m && ny > 0 && trash[nx][ny]==1 && !visited[nx][ny]) {
				size++;
				maxTrash(trash,nx,ny);
			}
		}
	}
		
	
	
}
