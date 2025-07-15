package Gold05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RedGreenMedicine {
	
	static int[] dx = {1,0,-1,0};
	static int[] dy = {0,1,0,-1};
	static int n;
	static int red = 0;
	static int green = 0;
	static int blue = 0;
	static int redGreen = 0;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		String[][] rgb = new String[n][n];
		boolean[][] visited = new boolean[n][n];
		
		for(int i=0; i<n; i++) {
			String[] str = br.readLine().split("");
			for(int j=0; j<n; j++) {
				rgb[i][j] = str[j];
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(rgb[i][j].equals("R") && !visited[i][j]) {
					red++;
					redCount(rgb,visited,i,j);
				}
				if(rgb[i][j].equals("B") && !visited[i][j]) {
					blue++;
					blueCount(rgb, visited, i, j);
				}
				if(rgb[i][j].equals("G") && !visited[i][j]) {
					green++;
					greenCount(rgb, visited, i, j);
				}
			}
		}
		
		boolean[][] visited2 = new boolean[n][n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if((rgb[i][j].equals("R") || rgb[i][j].equals("G")) && !visited2[i][j]) {
					redGreen++;
					redGreenCount(rgb, visited2, i, j);
				}
			}
		}
		
		int normal = red + blue + green;
		int rg = redGreen + blue;
		
		System.out.println(normal+" "+rg);
	}

	static void redCount(String[][] rgb, boolean[][] visited, int x, int y) {
		visited[x][y] = true;
		
		for(int i=0; i<4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if(nx < n && nx >=0 && ny < n && ny >=0 && !visited[nx][ny] && rgb[nx][ny].equals("R")) {
				redCount(rgb,visited,nx,ny);
			}
		}
	}
	
	static void blueCount(String[][] rgb, boolean[][] visited, int x, int y) {
		visited[x][y] = true;
		
		for(int i=0; i<4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if(nx < n && nx >=0 && ny < n && ny >=0 && !visited[nx][ny] && rgb[nx][ny].equals("B")) {
				blueCount(rgb,visited,nx,ny);
			}
		}
	}
	
	static void greenCount(String[][] rgb, boolean[][] visited, int x, int y) {
		visited[x][y] = true;
		
		for(int i=0; i<4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if(nx < n && nx >=0 && ny < n && ny >=0 && !visited[nx][ny] && rgb[nx][ny].equals("G")) {
				greenCount(rgb,visited,nx,ny);
			}
		}
	}
	
	static void redGreenCount(String[][] rgb, boolean[][] visited, int x, int y) {
		visited[x][y] = true;
		
		for(int i=0; i<4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if(nx < n && nx >=0 && ny < n && ny >=0 && !visited[nx][ny] && (rgb[nx][ny].equals("R") || rgb[nx][ny].equals("G"))) {
				redGreenCount(rgb, visited, nx, ny);
			}
		}
	}
}
