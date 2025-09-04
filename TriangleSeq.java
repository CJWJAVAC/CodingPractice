package Silver03;

import java.util.Scanner;

public class TriangleSeq {
	
	static long dp[];

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int t = scan.nextInt();
		
		for(int i=0; i<t; i++) {
			int n = scan.nextInt();
			long res = P(n);
			sb.append(res+"\n");
		}
		
		System.out.println(sb);
	}
	
	static long P(int n) {
		dp = new long[n+1];
		if(n==1 || n==2 || n==3) return 1;
		else {
			dp[1] = 1;
			dp[2] = 1;
			dp[3] = 1;
			for(int i=4; i<=n; i++) {
				dp[i] = dp[i-3] + dp[i-2];
			}
		}
		return dp[n];
	}

}
