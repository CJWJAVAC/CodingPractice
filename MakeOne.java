package Silver03;

import java.util.Scanner;

public class MakeOne {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int [] dp = new int[n+1];
		
		for(int i=2; i<=n; i++) {
			dp[i] = dp[i-1]+1;
			
			if(i%2==0) {
				dp[i] = Math.min(dp[i], dp[i/2]+1);
			}
			if(i%3==0) {
				dp[i] = Math.min(dp[i], dp[i/3]+1);
			}
		}
		
		System.out.println(dp[n]);
	}
	
}
