package Silver01;

import java.util.Arrays;
import java.util.Scanner;

public class OfficeAssign {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[][] num = new int[n][2];
		
		for(int i=0; i<n; i++) {
			num[i][0] = scan.nextInt();
			num[i][1] = scan.nextInt();
		}
		
		Arrays.sort(num, (a,b)->{
			if(a[1]==b[1]) {
				return Integer.compare(a[0], b[0]);
			}
			return Integer.compare(a[1], b[1]);
		});
		
		int count = 1;
		int end = num[0][1];
		for(int i=1; i<n; i++) {
			int start = num[i][0];
			if(start>=end) {
				end = num[i][1];
				count++;
			}
		}
		System.out.println(count);
	}
}
