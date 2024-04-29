package Silver04;

import java.util.Scanner;

public class SugarDeliver {
	
	public static int count = 0;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		if(n==3 || n==5) {
			count=1;
		}
		else {
			while(n!=0) {
				if(n%5==0) {n-=5; count++;}
				else {n-=3; count++;}
				
				if(n>0 && n<3) {
					count=-1;
					break;
				}
			}
		}
		System.out.println(count);
	}
	
}
