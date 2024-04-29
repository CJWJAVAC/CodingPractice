package Bronze02;

import java.util.Scanner;

public class DivisionTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		for(int i=0; i<t; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			int res=1;
			for(int j=0; j<b; j++) {
				res=(res*a)%10;
			}
			if(res==0) {
				res=10;
			}
			System.out.println(res);
		}
	}

}
