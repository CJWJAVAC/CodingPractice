package Silver02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class PutInBox {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		String[] str = br.readLine().split(" ");
		int[] box = new int[n];
		
		for(int i=0; i<n; i++) {
			box[i] = Integer.parseInt(str[i]);
		}
		
		int[] dp = new int[n];
		Arrays.fill(dp, 1);
		
		for(int i=1; i<n; i++) {
			for(int j=0; j<i; j++) {
				if(box[i]>box[j]) {
					dp[i] = Math.max(dp[i], dp[j]+1);
				}
			}
		}
		
		Arrays.sort(dp);
		System.out.println(dp[n-1]);
	}

}
