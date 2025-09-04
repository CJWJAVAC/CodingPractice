package Silver05;

import java.util.Scanner;

public class ProbableRankA {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		
		for(int i=0; i<T; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			if(b>a) {
				System.out.println("yes");
			}
			else if(b<a) {
				System.out.println("yes");
			}
			else {
				System.out.println("yes");
			}
		}
	}

}
