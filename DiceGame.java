package Bronze03;

import java.util.Scanner;

public class DiceGame {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int result=0;
		int max=0;
		for(int i=0; i<n; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = scan.nextInt();
			if(a==b&&a==c&&b==c)
				result=10000+a*1000;
			else if((a==b&&b!=c)||(a==c&&a!=b))
				result=1000+a*100;
			else if(a!=c&&b==c)
				result=1000+b*100;
			else
				if(a>b&&a>c)
					result=a*100;
				else if(b>a&&b>c)
					result=b*100;
				else if(c>a&&c>b)
					result=c*100;
			if(max<result)
				max=result;
		}
		System.out.println(max);
	}

}
