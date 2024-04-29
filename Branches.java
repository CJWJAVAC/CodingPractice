package Bronze03;

import java.util.Scanner;

public class Branches {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			int a=scan.nextInt();
			int leaf=0;
			if(a==0)
				break;
			for(int i=0; i<a; i++) {
				int split = scan.nextInt();
				int sub = scan.nextInt();
				if(i>0)
					split=leaf*split;
				leaf=split-sub;
			}
			System.out.println(leaf);
		}
	}

}
