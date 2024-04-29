package Bronze02;

import java.util.Scanner;

public class Chess {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int res = 0;
		for(int i=0; i<8; i++) {
			String str = scan.next();
			for(int j=0; j<8; j++) {
				if(i%2==0&&j%2==0) {
				if(str.charAt(j)=='F') {
					res++;
				}
				}
				if(i%2==1&&j%2==1) {
					if(str.charAt(j)=='F')
						res++;
				}
			}
		}
		System.out.println(res);
	}

}
