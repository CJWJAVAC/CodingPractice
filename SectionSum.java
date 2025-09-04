package Silver01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SectionSum {
	
	static int n;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		String[] nm = br.readLine().split(" ");
		n = Integer.parseInt(nm[0]);
		int m = Integer.parseInt(nm[1]);
		
		long[][] board = new long[n+1][n+1];
		long[][] dp = new long[n+1][n+1];
		
		for(int i=1; i<=n; i++) {
			String num = br.readLine();
			st = new StringTokenizer(num," ");
			
			for(int j=1; j<=n; j++) {
				board[i][j] = Long.parseLong(st.nextToken());;
				dp[i][j] = board[i][j] + dp[i-1][j] + dp[i][j-1] - dp[i-1][j-1];
			}
		}
		
		StringBuilder sb = new StringBuilder();

		for(int i=0; i<m; i++) {
			String[] xy = br.readLine().split(" ");
			int x1 = Integer.parseInt(xy[0]);
			int y1 = Integer.parseInt(xy[1]);
			int x2 = Integer.parseInt(xy[2]);
			int y2 = Integer.parseInt(xy[3]);
			
			long result = 0;
			if(x1 == x2 && y1 == y2) {
				result = board[x1][y1];
			}
			else {
				result = dp[x2][y2] - dp[x1-1][y2] - dp[x2][y1-1] + dp[x1-1][y1-1];
			}
			sb.append(result+"\n");
		}
		
		System.out.println(sb);
		
	}
	
}
