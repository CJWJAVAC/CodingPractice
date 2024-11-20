package Silver02;

import java.util.Arrays;
import java.util.Scanner;

public class TSP_2 {
	
	static int n;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		n = scan.nextInt();
		
		int[][] city = new int[n][n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				city[i][j] = scan.nextInt();
			}
		}
		
		int res = tps(city);
		System.out.println(res);
	}
	
	static int tps(int[][] city) {
		int[][] dp = new int[n][1<<n];
		for(int[] list : dp) {
			Arrays.fill(list, 10000000);
		}
		
		dp[0][1] = 0;
		
		for(int visited=1; visited<(1<<n); visited++) {
			for(int i=0; i<n; i++) {
				if((visited & (1<<i))!=0) {
					for(int j=0; j<n; j++) {
						if((visited & (1<<j))==0 && city[i][j]!=0) {
							int nextvisit = visited | (1<<j);
							dp[j][nextvisit] = Math.min(dp[j][nextvisit], dp[i][visited] + city[i][j]);
						}
					}
				}
			}
		}
		
		int min = 10000000;
		for(int i=1; i<n; i++) {
			if(city[i][0]!=0) {
				min = Math.min(min, dp[i][(1<<n)-1] + city[i][0]);
			}
		}
		return min;
	}
	
}
