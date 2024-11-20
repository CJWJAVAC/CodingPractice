package Silver02;

import java.util.Scanner;

public class MovingMaze {

	static int n, m;
	static int[][] maze;
	static int[][] candy;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		n = scan.nextInt();
		m = scan.nextInt();
		maze = new int[n+1][m+1];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				maze[i+1][j+1] = scan.nextInt();
			}
		}
		
		candy = new int[n+1][m+1];
        for (int i = 1; i < n+1; i++) {
            for (int j = 1; j < maze[0].length; j++) {
                candy[i][j] = Math.max(candy[i-1][j-1], Math.max(candy[i-1][j], candy[i][j-1]))+maze[i][j];
            }
        }
				
		System.out.println(candy[n][m]);
	}
	
}
