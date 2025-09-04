package Silver02;

import java.util.Scanner;

public class OrganicCabbage {
	static int [][] cabbage;
	static boolean [][] visited;
	static int cx[] = {0,0,-1,1};
	static int cy[] = {-1,1,0,0};
	static int n,m,k;
	static int result;
	static int nx, ny;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int t = scan.nextInt();
		
		for(int i=0; i<t; i++) {
			m = scan.nextInt();
			n = scan.nextInt();
			k = scan.nextInt();
			
			cabbage = new int[n][m];
			visited = new boolean[n][m];
			
			for(int j=0; j<k; j++) {
				int x = scan.nextInt();
				int y = scan.nextInt();
				cabbage[y][x] = 1;
			}
			
			result = 0;
			for(int j=0; j<n; j++) {
				for(int l=0; l<m; l++) {
					if(cabbage[j][l] == 1 && visited[j][l] == false) {
						result++;
						dfs(l,j);
					}
				}
			}
			sb.append(result+"\n");
		}
		
		System.out.println(sb);
	}
	
	static void dfs(int x, int y) {
		visited[y][x] = true;
		
		for(int i=0; i<4; i++) {
			nx = x+cx[i];
			ny = y+cy[i];
			
			if(nx < m && nx>=0 && ny<n && ny>=0 && visited[ny][nx]==false && cabbage[ny][nx]==1) { 
				dfs(nx,ny);
			}
		}
	}

}
