package Silver02;

import java.util.Arrays;
import java.util.Scanner;

public class MostLongestIncrease {
	
	static int dp[];

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int[] num = new int[n];
		dp = new int[n];
		Arrays.fill(dp, 0);
		
		for(int i=0; i<n; i++) {
			num[i] = scan.nextInt();
		}
		
		dp[0] = num[0];
		
		for(int i=1; i<n; i++) {
			for(int j=0; j<i; j++) {
				if(num[i]>num[j]) {
					dp[i] = Math.max(dp[i], num[i]+dp[j]);
				}else {
					dp[i] = Math.max(num[i], dp[i]);
				}
			}
		}
		
		//Arrays.sort(dp);
		
		for(int next : dp) {
			System.out.print(next+" ");
		}
		
		//System.out.println(dp[n-1]);
	}

}
