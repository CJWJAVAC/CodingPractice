package Silver01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class IntegerTriangle {
	
	static int n;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		n = Integer.parseInt(br.readLine());
		int[][] triangle = new int[n][];
		int[][] dp = new int[n][];
		
		for(int i=0; i<n; i++) {
			triangle[i] = new int[i+1];
			dp[i] = new int[i+1];
		}
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine()," ");
			for(int j=0; j<=i; j++) {
				triangle[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		dp[0][0] = triangle[0][0];
		calTriangle(triangle,dp);
		
		int sum = 0;
		Arrays.sort(dp[n-1]);
		System.out.println(dp[n-1][n-1]);
		
	}
	
	static void calTriangle(int[][] triangle, int[][] dp) {
		for(int i=1; i<n; i++) {
			for(int j=0; j<=i; j++) {
				if(i==1) {
					dp[i][j] = dp[0][0] + triangle[i][j];
				}else {
					if(j==0) {
						dp[i][j] = dp[i-1][j] + triangle[i][j];
					}
					else if(j==i) {
						dp[i][j] = dp[i-1][j-1] + triangle[i][j];
					}
					else {
						dp[i][j] = Math.max(dp[i-1][j-1]+triangle[i][j], dp[i-1][j]+triangle[i][j]);
					}
				}
			}
		}
	}
	
}
