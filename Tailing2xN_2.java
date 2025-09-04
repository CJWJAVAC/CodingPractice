package Silver03;

import java.util.Scanner;

public class Tailing2xN_2 {
	
	static long dp[];

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		dp = new long[n+1];
		
		long res = tailing(n);
		
		System.out.println(res);
	}

	static long tailing(int n) {
		if(dp[n]!=0) return dp[n];
		
		if(n==1) return dp[1]=1;
		else if(n==2) return dp[2]=3;
		else {
			return dp[n] = (tailing(n-1) + tailing(n-2)*2)%10007;
		}
	}
	
}
