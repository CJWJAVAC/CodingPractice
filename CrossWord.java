package Bronze01;

import java.util.Scanner;

public class CrossWord {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String A = scan.next();
		String B = scan.next();
		int a=0,b=0;
		for(int i=0; i<A.length(); i++) {
			if((b=B.indexOf(A.charAt(i)))>=0) {
				a=i;
				b=b;
				break;
			}
		}
		char [][] cross = new char[B.length()][A.length()];
		for(int i=0; i<B.length(); i++) {
			for(int j=0; j<A.length(); j++) {
				cross[i][j]='.';
				cross[b][j]=A.charAt(j);
				cross[i][a]=B.charAt(i);
			}
		}
		for(int i=0; i<B.length(); i++) {
			for(int j=0; j<A.length(); j++) {
				System.out.print(cross[i][j]);
			}
			System.out.println();
		}
	}
}
