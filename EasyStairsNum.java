package Silver01;

import java.util.Scanner;

public class EasyStairsNum {
	
	static int[][] dp;
		
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		dp = new int[n+1][10];
		for(int i=0; i<10; i++) {
			dp[1][i] = 1;
		}
		
		int result = stairsNum(n);
		System.out.println(result);
	
	}

	static int stairsNum(int n) {
		int result = 0;
		
		for(int i=2; i<=n; i++) {
			for(int j=0; j<10; j++) {
				if(j==0) {
					dp[i][0] = dp[i-1][1];
				}
				else if(j==9) {
					dp[i][j] = dp[i-1][8];
				}else {
					dp[i][j] = (dp[i-1][j-1] + dp[i-1][j+1])%1000000000;
				}
			}
		}
		
		for(int i=1; i<10; i++) {
			result = (result + dp[n][i])%1000000000;
		}
		return result;
	}
}
