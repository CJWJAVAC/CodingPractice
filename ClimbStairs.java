package Silver03;

import java.util.Arrays;
import java.util.Scanner;

public class ClimbStairs {
	
	static int[] climb;
	static int[] dp;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		climb = new int[n];
		dp = new int[n];
		
		for(int i=0; i<n; i++) {
			int stair = scan.nextInt();
			climb[i] = stair;
		}
		
		int res = max(n);
		System.out.println(res);
	}
	
	static int max(int n) {
		if(n==1) return climb[0];
		if(n==2) return climb[0] + climb[1];
		dp[0] = climb[0];
		dp[1] = climb[0]+climb[1];
		dp[2] = Math.max(climb[0]+climb[2], climb[1]+climb[2]);
		
		for(int i=3; i<n; i++) {
			dp[i] = Math.max(dp[i-2]+climb[i], dp[i-3]+climb[i-1]+climb[i]);
		}
		
		return dp[n-1];
	}

}
