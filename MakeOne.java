package Silver01;

import java.util.*;

public class MakeOne {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int n = scan.nextInt();
		
		int[] dp = new int[n+1];
		int[] current = new int[n+1];
		
		dp[1] = 0;
		current[1] = -1;
		
		for(int i=2; i<=n; i++) {			
			dp[i] = dp[i-1]+1;
			current[i] = i-1;
			
			if(i%2==0 && dp[i]>dp[i/2]+1) {
				dp[i] = dp[i/2]+1;
				current[i] = i/2;
			}
			
			if(i%3==0 && dp[i]>dp[i/3]+1) {
				dp[i] = dp[i/3]+1;
				current[i] = i/3;
			}
		}
		
		System.out.println(dp[n]);
		
		for(int i=n; i!=-1; i=current[i]) {
			sb.append(i+" ");
		}
		
		System.out.println(sb);
		
	}
	
}
