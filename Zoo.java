package Silver01;

import java.util.*;

public class Zoo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		long[][] dp= new long[n+1][3];
		
		dp[0][0] = 1; 
		dp[0][1] = dp[0][2] = 1;
		
		for(int i=1; i<n; i++) {
			dp[i][0] = (dp[i-1][0] + dp[i-1][1] + dp[i-1][2])%9901;
			dp[i][1] = (dp[i-1][0] + dp[i-1][2])%9901;
			dp[i][2] = (dp[i-1][0] + dp[i-1][1])%9901;
		}
		
		long res = dp[n-1][0]+dp[n-1][1]+dp[n-1][2];
		
		System.out.println(res%9901);
	}

}
