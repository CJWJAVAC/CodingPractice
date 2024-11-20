package Silver02;

import java.util.Scanner;

public class BinaryCoefficient {
	
	static int dp[][];

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int k = scan.nextInt();
		dp = new int[n+1][k+1];
		
		binary(n,k);
		
		System.out.println(dp[n][k]);
	}

	static void binary(int n, int k) {
		for(int i=0; i<=n; i++) {
			for(int j=0; j<=Math.min(i, k); j++) {
				if(j==0 || j==i) {
					dp[i][j] = 1;
				}else {
					dp[i][j] = (dp[i-1][j-1] + dp[i-1][j])%10007;
				}
			}
		}
	}
}
