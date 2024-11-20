package Silver02;

import java.util.Arrays;
import java.util.Scanner;

public class GoldBach {
	
	static boolean[] prime;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int t = scan.nextInt();
		for(int i=0; i<t; i++) {
			int n = scan.nextInt();
			sb.append(goldBach(n)+"\n");
		}
		System.out.println(sb);
	}

	static String goldBach(int n) {
		prime = new boolean[n+1];
		Arrays.fill(prime, true);
		prime[0] = true;
		prime[1] = true;
		
		for(int i=2; i*i<prime.length; i++) {
			if(prime[i]) {
				for(int j=i*i; j<prime.length; j+=i) {
					prime[j] = false;
				}
			}
		}
		
		int a=0,b=0;
		for(int i=2; i<=n/2; i++) {
			if(prime[i] && prime[n-i]) {
				a=i;
				b=n-i;
			}
		}
		return a+" "+b;
	}
	
}
