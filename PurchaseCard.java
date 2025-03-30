package Silver01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class PurchaseCard {
	
	static int n;
	static int[] dp;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		
		String[] str = br.readLine().split(" ");
		int[] card = new int[n+1];
		dp = new int[n+1];
		
		for(int i=1; i<=n; i++) {
			card[i] = Integer.parseInt(str[i-1]);
		}
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				dp[i] = Math.max(dp[i], dp[i-j]+card[j]);
			}
		}
		
		Arrays.sort(dp);
		
		System.out.println(dp[n]);
	}
	
}
