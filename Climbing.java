package Bronze01;

import java.util.Scanner;

public class Climbing {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int [] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		int climb=0;
		int max = 0;
		for(int i=0; i<n-1; i++) {
			if(arr[i]<arr[i+1]) {
				climb+=(arr[i+1]-arr[i]);
				if(max<climb) {
					max=climb;
				}
			}
			if((arr[i]>arr[i+1])||(arr[i]==arr[i+1])) {
				climb=0;
			}
		}
		System.out.println(max);
 	}

}
