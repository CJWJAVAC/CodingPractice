package Silver04;

import java.util.Scanner;

public class Hansoo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int count=0;
		
		if(n>0 && n<100) {
			count+=n;
		}
		else {
			count=99;
			for(int i=100; i<=n; i++) {
				int num = i;
				int a = num/100;
				num%=100;
				int b = num/10;
				num%=10;
				int c = num;
				if(sub(a,b)==sub(b,c))
					count++;
			}
		}
		System.out.println(count);
	}

	static int sub(int x, int y) {
		return x-y;
	}
	
}
