package Silver03;

import java.util.Arrays;
import java.util.Scanner;

public class FindingMinor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int m = scan.nextInt();
		int n = scan.nextInt();
		
		PrimeNums(m,n);
	}
	
	public static void PrimeNums(int a, int b) {
		boolean[] nums = new boolean[b+1];
		StringBuilder sb = new StringBuilder();
		
		Arrays.fill(nums, true);
		
		for(int i=2; i*i<=b; i++) {
			if(nums[i]) {
				for(int j=i*i; j<=b; j+=i) {
					nums[j]=false;
				}
			}
		}
		
		for(int i=Math.max(a, 2); i<=b; i++) {
			if(nums[i]) {
				sb.append(i+"\n");
			}
		}
		System.out.println(sb);
	}

}
