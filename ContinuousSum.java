package Silver02;

import java.util.Arrays;
import java.util.Scanner;

public class ContinuousSum {
	
	static int[] dp;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int [] num = new int[n];
		
		for(int i=0; i<n; i++) {
			num[i] = scan.nextInt();
		}
		int currentMax = num[0];
		int AllMax = num[0];
		
		for(int i=1; i<n; i++) {
			currentMax = Math.max(num[i], currentMax+num[i]);
			AllMax = Math.max(currentMax, AllMax);
		}
		System.out.println(AllMax);
	}

}
