package Silver01;

import java.util.Arrays;
import java.util.Scanner;

public class WineTasting {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] wine = new int[n];
		
		for(int i=0; i<n; i++) {
			wine[i] = scan.nextInt();
		}
		
		int result = getWine(wine);
		
		System.out.println(result);
	}

	static int getWine(int[] wine) {
		int n = wine.length;
		int[] dp = new int[n];
		
		if(n==1) {
			return wine[0];
		}
		if(n==2) {
			return wine[0] + wine[1];
		}
		if(n==3) {
			int current = Math.max(wine[0], wine[1]);
			return Math.max(wine[0]+wine[1], wine[2]+current);
		}
		
		dp[0] = wine[0];
		dp[1] = wine[0] + wine[1];
		int current = Math.max(wine[0], wine[1]);
		dp[2] = Math.max(dp[1], wine[2]+current);
		
		for(int i=3; i<n; i++) {
			dp[i] = Math.max(dp[i-1], Math.max(wine[i]+dp[i-2], wine[i]+wine[i-1]+dp[i-3]));
		}
		
		Arrays.sort(dp);
		
		return dp[n-1];
	}
	
}
