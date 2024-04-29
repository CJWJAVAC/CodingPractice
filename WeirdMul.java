package Bronze02;

import java.util.Scanner;

public class WeirdMul {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		long sum=0;
		for(int i=0; i<a.length(); i++) {
			char s = a.charAt(i);
			long A=s-'0';
			for(int j=0; j<b.length(); j++) {
				char k = b.charAt(j);
				long B=k-'0';
				sum=sum+A*B;
			}
		}
		System.out.println(sum);
	}

}
