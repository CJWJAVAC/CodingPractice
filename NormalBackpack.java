package Gold05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class NormalBackpack {

	static int n;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = br.readLine().split(" ");
		n = Integer.parseInt(str[0]);
		int k = Integer.parseInt(str[1]);
		
		int[] weight = new int[n];
		int[] value = new int[n];
		int[] dp = new int[k+1];
		
		for(int i=0; i<n; i++) {
			String[] str2 = br.readLine().split(" ");
			weight[i] = Integer.parseInt(str2[0]);
			value[i] = Integer.parseInt(str2[1]);
		}
		
		for(int i=0; i<n; i++) {
			for(int j=k; j>=weight[i]; j--) {
				dp[j] = Math.max(dp[j], dp[j-weight[i]]+value[i]);
			}
		}
		
		Arrays.sort(dp);
		System.out.println(dp[k]);
	}
	
}
