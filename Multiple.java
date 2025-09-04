package Silver01;

import java.util.Scanner;

public class Multiple {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		long a = scan.nextLong();
		long b = scan.nextLong();
		long c = scan.nextLong();
		
		System.out.println(division(a,b,c));
		
		
	}

	static long division(long a, long b, long c) {
		a%=c;
		long result = 1;
		
		while(b>0) {
			if(b%2!=0) {
				result=(result*a)%c;
			}
			
			a = (a*a)%c;
			b/=2;
		}
		
		return result;
	}
	
}
