package Bronze03;

import java.util.Scanner;

public class HomeAddress {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNextInt()) {
			int width=0;
			int n=scan.nextInt();
			if(n==0)
				break;
			String str = String.valueOf(n);
			for(String s:str.split("")) {
				width=width+1;
				if(s.equals("0"))
					width+=4;
				else if(s.equals("1"))
					width+=2;
				else
					width+=3;
			}
			System.out.println(width+1);
		}
	}

}
