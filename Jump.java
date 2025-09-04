package Silver01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Jump {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[][] num = new int[n][n];
		long[][] dp = new long[n][n];
		dp[0][0] = 1;
		
		for(int i=0; i<n; i++) {
			String[] str = br.readLine().split(" ");
			for(int j=0; j<n; j++) {
				num[i][j] = Integer.parseInt(str[j]);
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(i==n-1 && j==n-1) {
					break;
				}
				int row = i+num[i][j];
				int col = j+num[i][j];
				if(dp[i][j]!=0) {
					if(row<n) {
						dp[row][j]+=dp[i][j];
					}
					if(col<n) {
						dp[i][col]+=dp[i][j];
					}
				}
			}
		}
		
		System.out.println(dp[n-1][n-1]);
	}

}
