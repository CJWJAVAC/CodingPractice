package Bronze03;

import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n =scan.nextInt();
		int f = scan.nextInt();
		int back = n%100;
		n=n-back;
		for(int i=0; i<99; i++) {
			if(n%f==0) {
				if(n%100<10) {
					System.out.println("0"+n%100);
					break;}
				System.out.println(n%100);
				break;
			}
			n++;
		}
	}

}
