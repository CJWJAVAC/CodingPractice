package Silver03;

import java.util.Scanner;

public class PinaryNumber {
	
	static long num[];

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		num = new long[n+1];
		
		long res = Pinary(n);
		
		System.out.println(res);
	}

	private static long Pinary(int n) {
		if(num[n]!=0) {
			return num[n];
		}
		
		if(n==1) {
			return num[1]=1;
			}
		else if(n==2) {
			return num[2] = 1;
		}
		else {
			return num[n] = Pinary(n-1) + Pinary(n-2);
		}
	}
	
}
