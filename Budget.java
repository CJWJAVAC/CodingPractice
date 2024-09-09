package Silver02;

import java.util.Arrays;
import java.util.Scanner;

public class Budget {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int num[] = new int[n];
		int sum = 0;
		
		for(int i=0; i<n; i++) {
			num[i] = scan.nextInt();
			sum+=num[i];
		}
		
		int m = scan.nextInt();
			
		Arrays.sort(num);
		int start = 0;
		int end = num[n-1];
		
		int res = binary(num,start,end,sum,m);
		
		System.out.println(res);
	}

	static int binary(int[] num, int start, int end, int sum, int m) {
		int resBudget = 0;
		
		while(start<=end) {
			int middle = (start+end)/2;
			int res = calculateBudget(num,middle, m);
			
			if(res>=0) {
				resBudget = middle;
				start = middle+1;
			}else {
				end = middle-1;
			}
		}
		
		
		return resBudget;
	}
	
	static int calculateBudget(int[] num, int middle, int m) {
		for(int next : num) {
			if(next<=middle) {
				m-=next;
			}else {
				m-=middle;
			}
		}
		return m;
	}
	
}
