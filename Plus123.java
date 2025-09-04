package Silver03;

import java.util.Scanner;

public class Plus123 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int t = scan.nextInt();
		
		for(int i=0; i<t; i++) {
			int n = scan.nextInt();
			System.out.println(count(n));
		}
	}

	static int count(int a) {
		if(a<0) return 0;
		else if(a==0) return 1;
		else {
			return count(a-1) + count(a-2) + count(a-3);
		}
	}
	
}
