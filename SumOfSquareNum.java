package Silver02;

import java.util.Scanner;

public class SumOfSquareNum {

	static int dp[];
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		dp = new int[n+1];
		
		for(int i=0; i<=n; i++) {
			dp[i] = i;
		}
		
		for(int i=4; i<=n; i++) {
			for(int j=2; j<=Math.sqrt(i); j++) {
				dp[i] = Math.min(dp[i], dp[i-j*j]+1);
			}
		}
				
		System.out.println(dp[n]);
	}
	
}
