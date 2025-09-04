package Silver03;

import java.util.Arrays;
import java.util.Scanner;

public class Tailing2xN {
	
	static long[] memo;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		memo = new long[n+1];
		Arrays.fill(memo, -1);
		
		long res = tail(n);
		System.out.println(res);
	}

	static long tail(int n) {
		if(n==1) {
			return 1;
		}
		else if(n==2) {
			return 2;
		}
		
		if(memo[n]!=-1) {
			return memo[n];
		}
		
		memo[n] = (tail(n-1) + tail(n-2))%10007;
		return memo[n];
	}
	
}
