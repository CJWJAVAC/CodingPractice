package Bronze01;

import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int max=0;
		int min=1000001;
		for(int i=0; i<n; i++) {
			int k = scan.nextInt();
			if(n==1) {
				max=min=k;
			}
			if(k>max)
				max=k;
			if(k<min)
				min=k;
		}
		System.out.println(max*min);
	}
}
