package Silver01;

import java.util.*;

public class KainCalendar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int t = scan.nextInt();
		
		for(int i=0; i<t; i++) {
			int m = scan.nextInt();
			int n = scan.nextInt();
			int x = scan.nextInt();
			int y = scan.nextInt();
			
			int lcm = m*n/gcd(m,n);
			boolean flag = false;
						
			for(int j=x; j<=lcm; j+=m) {
				if((j-1)%n==(y-1)) {
					sb.append(j+"\n");
					flag = true;
					break;
				}
			}
			
			if(!flag) sb.append("-1"+"\n");
		}
		System.out.println(sb);
	}
	static int gcd(int a, int b) {
		if(b==0) {
			return a;
		}
		return gcd(b,a%b);
	}
}
