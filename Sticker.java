package Silver01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sticker {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i=0; i<t; i++) {
			int n = Integer.parseInt(br.readLine());
			int[][] num = new int[2][n+1];
			
			for(int j=0; j<2; j++) {
				String str = br.readLine();
				st = new StringTokenizer(str," ");
				for(int k=1; k<=n; k++) {
					num[j][k] = Integer.parseInt(st.nextToken());
				}
			}
			
			if(n==1) {
				sb.append(Math.max(num[0][1], num[1][1])+"\n");
			}else {
				sb.append(getSticker(num,n)+"\n");
			}
		}
		System.out.println(sb);
	}

	static int getSticker(int[][] num, int n) {
		int[][] dp = new int[2][n+1];
		dp[0][1] = num[0][1];
		dp[1][1] = num[1][1];
		dp[0][2] = dp[1][1] + num[0][2];
		dp[1][2] = dp[0][1] + num[1][2];
		
		if(n==2) {
			return Math.max(dp[0][2], dp[1][2]);
		}
		
		for(int i=3; i<=n; i++) {
			dp[0][i] = Math.max(num[0][i] + dp[1][i-1], num[0][i] + Math.max(dp[0][i-2], dp[1][i-2]));
			dp[1][i] = Math.max(num[1][i] + dp[0][i-1], num[1][i] + Math.max(dp[0][i-2], dp[1][i-2]));
		}
		
		return Math.max(dp[0][n], dp[1][n]);
	}
	
}
