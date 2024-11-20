package Silver02;

import java.util.Scanner;

public class IslandNumber {
	
	static int[][] map;
	static boolean [][] visited;
	static int[] cx = {0,1,1,1,0,-1,-1,-1};
	static int[] cy = {1,1,0,-1,-1,-1,0,1};
	static int res;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			res = 0;
			
			int w = scan.nextInt();
			int h = scan.nextInt();
			if(w==0 && h==0) {
				break;
			}
			
			map = new int[h][w];
			visited = new boolean[h][w];
			
			for(int i=0; i<h; i++) {
				for(int j=0; j<w; j++) {
					map[i][j] = scan.nextInt();
				}
			}
			
			for(int i=0; i<h; i++) {
				for(int j=0; j<w; j++) {
					if(!visited[i][j] && map[i][j]==1) {
						res++;
						dfs(j,i);
					}
				}
			}
			sb.append(res+"\n");
		}
		System.out.println(sb);
	}

	static void dfs(int x, int y) {
		visited[y][x] = true;
		
		for(int i=0; i<8; i++) {
			int nx = x + cx[i];
			int ny = y + cy[i];
			
			if(nx>=0 && nx<map[0].length && ny>=0 && ny<map.length && !visited[ny][nx] && map[ny][nx] == 1) {
				dfs(nx, ny);
			}
		}
		
		
	}
	
}
