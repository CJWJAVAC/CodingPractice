package Silver05;

import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		int B = scan.nextInt();
		int N = scan.nextInt();
		int i=-1;
		int res = 0;
		while(i!=N) {
			res = A/B;
			int ano = A%B;
			A=ano*10;
			i++;
		}
		System.out.println(res);
	}

}
