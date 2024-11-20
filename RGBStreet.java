package Silver01;

import java.util.Arrays;
import java.util.Scanner;

public class RGBStreet {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[][] street = new int[n][3];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<3; j++) {
				street[i][j] = scan.nextInt();
			}
		}
		
		int[][] dp = new int[n][3];
		dp[0][0] = street[0][0];
		dp[0][1] = street[0][1];
		dp[0][2] = street[0][2];
		
		for(int i=1; i<n; i++) {
			dp[i][0] = street[i][0] + Math.min(dp[i-1][1], dp[i-1][2]);
			dp[i][1] = street[i][1] + Math.min(dp[i-1][0], dp[i-1][2]);
			dp[i][2] = street[i][2] + Math.min(dp[i-1][0], dp[i-1][1]);
		}
		
		Arrays.sort(dp[n-1]);
		System.out.println(dp[n-1][0]);
	}

}

