package Bronze03;

import java.util.Scanner;

public class Plug {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int res=0;
		for(int i=0; i<n; i++) {
			int mul = scan.nextInt();
			res+=mul;
			if(i>0)
				res--;
		}
		System.out.println(res);
	}

}
