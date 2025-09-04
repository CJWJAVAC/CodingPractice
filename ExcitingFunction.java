package Silver02;

import java.util.Scanner;

public class ExcitingFunction {
	
	static int dp[][][];

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		dp = new int[21][21][21];
		
		for(int i=0; i<21; i++) {
			for(int j=0; j<21; j++) {
				for(int k=0; k<21; k++) {
					dp[i][j][k] = -1;
				}
			}
		}
		
		while(true) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = scan.nextInt();
			if(a==-1 && b==-1 && c==-1) {
				break;
			}
			int res = w(a,b,c);
			sb.append("w("+a+", "+b+", "+c+") = "+res).append("\n");
		}
		System.out.println(sb);
	}

	static int w(int a, int b, int c) {
		if(a<=0 || b<=0 || c<=0) {
			return 1;
		}
		if(a>20 || b>20 || c>20) {
			return w(20,20,20);
		}
		if(dp[a][b][c]!=-1) {
			return dp[a][b][c];
		}
		if(a<b && b<c) {
			dp[a][b][c] = w(a,b,c-1) + w(a,b-1,c-1) - w(a,b-1,c);
		}
		else {
			dp[a][b][c] = w(a-1,b,c) + w(a-1,b-1,c) + w(a-1,b,c-1) - w(a-1,b-1,c-1);
		}
		return dp[a][b][c];
	}
	
}
