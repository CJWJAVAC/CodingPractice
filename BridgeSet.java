package Silver05;

import java.util.Scanner;

public class BridgeSet {
	
	static int[][] dp = new int[30][30];

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<T; i++) {
			int n = scan.nextInt();
			int m = scan.nextInt();
			System.out.println(combination(m,n));
		}
		
	}
	
	static int combination(int a, int b) {
		if(dp[a][b]>0) {
			return dp[a][b];
		}
		if(a==b || b==0) {
			return dp[a][b]=1;
		}
		return dp[a][b] = combination(a-1,b-1)+combination(a-1,b);
	}

}
