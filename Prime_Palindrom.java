package Silver01;

import java.util.Scanner;

public class Prime_Palindrom {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int result = getPalin(n);
		
		if(result==0) {
			System.out.println("없음");
		}else if(result == 1){
			System.out.println(2);
		}else {
			System.out.println(result);
		}
	}

	static int getPalin(int n) {
		int i = n;
		while(true) {
			if(isPrime(i) && isPalin(i)) {
				return i;
			}
			i++;
		}
	}
	
	static boolean isPrime(int n) {		
		for(int i=2; i*i<=n; i++) {
			if(n%i==0) return false;
		}
		return true;
	}
	
	static boolean isPalin(int n) {
		String num = n+"";
		int end = num.length()/2;
		
		for(int i=0; i<end; i++) {
			char ch = num.charAt(i);
			char ch2 = num.charAt(num.length()-i-1);
			if(ch != ch2) return false;
		}
		return true;
	}
}
