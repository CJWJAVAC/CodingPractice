package Silver02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BertrandPostulate {
	
	static boolean prime[];
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			int n = scan.nextInt();
			if(n==0) {
				break;
			}
			
			sb.append(checkPrime(n)+"\n");
		}
		
		System.out.println(sb);
	}
	
	static int checkPrime(int a) {
		prime = new boolean[2*a+1];
		Arrays.fill(prime, true);
		prime[0] = true;
		prime[1] = true;
		int res = 0;
		
		for(int i=2; i*i<prime.length; i++) {
			if(prime[i]) {
				for(int j=i*i; j<prime.length; j+=i) {
					prime[j] = false;
				}
			}
		}
		
		for(int i=a+1; i<prime.length; i++) {
			if(prime[i]) {
				res++;
			}
		}
		
		return res;
	}

}
