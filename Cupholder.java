package Bronze01;

import java.util.Scanner;

public class Cupholder {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String str = scan.next();
		int holder=0;
		int Lcount=0;
		for(int i=0; i<n; i++) {
			if(str.charAt(i)=='S') {
				holder++;
				if(i==n-1) {
					holder++;
					}
			}
			if(str.charAt(i)=='L') {
				Lcount++;
				if(Lcount%2!=0) {
					holder++;
				}
				else if(Lcount%2==0){
					if(i==n-1) {
						holder++;
						continue;
					}
					continue;
				}
			}
		}
		if(holder>n)
			System.out.println(n);
		else
			System.out.println(holder);
	}

}
