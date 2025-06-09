package Silver02;

import java.util.Scanner;

public class OneLine {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int n = scan.nextInt();
		int[] num = new int[n];
		
		for(int i=1; i<=n; i++) {
			int k = scan.nextInt();
			int count = k;
			if(i == 1) {
				num[k] = 1;
				continue;
			}
			standing(i,k,num,0);
		}
		
		for(int i : num) {
			sb.append(i+" ");
		}
		System.out.println(sb);
	}
	
	static void standing(int i, int k, int[] num, int count) {
		for(int j=0; j<num.length; j++) {
			if(num[j] == 0 && count == k) {
				num[j] = i;
				break;
			}
			
			if(num[j] == 0) {
				count+=1;
			}
		}
	}
	
}
