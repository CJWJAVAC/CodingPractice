package Silver02;

import java.util.Arrays;
import java.util.Scanner;

public class LongestIncrease {

	static int dp[];
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] num = new int[n];
		dp = new int[n];
		Arrays.fill(dp, 1);
		
		for(int i=0; i<n; i++) {
			num[i] = scan.nextInt();
		}
		
		int res = 0;
		
		for(int i=1; i<num.length; i++) {
			for(int j=0; j<i; j++) {
				if(num[i]>num[j]) {
					dp[i] = Math.max(dp[i], dp[j]+1);
				}
			}
		}
		Arrays.sort(dp);
		System.out.println(dp[dp.length-1]);
	}
	
}
