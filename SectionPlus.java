package Silver03;

import java.util.Scanner;

public class SectionPlus {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		int arr[] = new int[n+1];
		arr[0] = 0;
		int a = arr.length;
		
		for(int i=1; i<n+1; i++) {
			arr[i] = scan.nextInt();
		}
		
		int preFix[] = new int[a];
		preFix[0] = 0;
		preFix[1] = arr[1];
		
		for(int i=2; i<a; i++) {
			preFix[i] = preFix[i-1] + arr[i];
		}
		
		for(int x=0; x<m; x++) {
			int i=scan.nextInt();
			int j=scan.nextInt();
			int res = preFix[j] - preFix[i-1];
			sb.append(res+"\n");
		}
		
		System.out.println(sb);
	}

}
