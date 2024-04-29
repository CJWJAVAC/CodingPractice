package Silver04;

import java.util.Scanner;

public class Tournament {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int a = scan.nextInt();//±èÁö¹Î
		int b = scan.nextInt();//ÀÓÇÑ¼ö
		int count = 1;
		
		for(int i=n; i>1; i/=2) {
			if((a%2!=0 && b==a+1) || (a==b+1 && b%2!=0)) break;
			if(a%2==0) a/=2;
			else a=(a+1)/2;
			if(b%2==0) b/=2;
			else b=(b+1)/2;
			
			count++;
		}
		System.out.println(count);
	}

}
