package Silver03;

import java.util.Scanner;

public class Progression {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int k = scan.nextInt();
		
		int[] rate = new int[n];
		
		for(int i=0; i<n; i++) {
			rate[i] = scan.nextInt();
		}
		
		int sum = 0;
		for(int i=0; i<k; i++) {
			sum += rate[i];
		}
		
		int max = sum;
		for(int i=k; i<n; i++) {
			sum = sum - rate[i-k] + rate[i];
			max = Math.max(max, sum);
		}
		System.out.println(max);
	}

}
