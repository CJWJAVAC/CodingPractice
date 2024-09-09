package Silver02;

import java.util.Scanner;

public class Plus_123 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		long[] dp = new long[1000001];
		
		dp[0]=1;
		dp[1]=1;
		dp[2]=2;
		dp[3]=4;
		
		for(int i=4; i<1000001; i++) {
			dp[i] = (dp[i-1]+dp[i-2]+dp[i-3])%1000000009;
		}
				
		int t = scan.nextInt();
		
		for(int i=0; i<t; i++) {
			int n = scan.nextInt();
			long res = dp[n];
			sb.append(res+" \n");
		}
		
		System.out.println(sb);
	}

}
