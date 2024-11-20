package Silver02;

import java.util.Scanner;

public class NumOfZero {
			
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		long n = scan.nextLong();
		long m = scan.nextLong();
		
		long NumOfTwo = NumTwo(n) - NumTwo(m) - NumTwo(n-m);
		long NumOfFive = NumFive(n) - NumFive(m) - NumFive(n-m);
		
		long res = Math.min(NumOfTwo, NumOfFive);
		
		System.out.println(res);
	}
	
	static long NumTwo(long n) {
		long count = 0;
		
		for(long i=n; i>=2; i/=2){
			count+=i/2;
			}
		
		return count;
	}
	
	static long NumFive(long n) {
		long count = 0;
		
		for(long i=n; i>=5; i/=5){
			count+=i/5;
			}
		
		return count;
	}
}
