package Silver01;

import java.util.Scanner;

public class AscentNum {
	
	static long [][] ascent;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		if(n==1) {
			System.out.println(10);
			System.exit(0);
		}
		
		ascent = new long[n][10];
		
		for(int i=0; i<10; i++) {
			ascent[0][i] = 1;
		}
		
		if(n>=2) {
			for(int i=1; i<n; i++) {
				long first = getRes(i-1);
				ascent[i][0] = first;
				for(int j=1; j<10; j++) {
					ascent[i][j] = (ascent[i][j-1] - ascent[i-1][j-1] + 10007)%10007;
				}
			}
		}
		
		System.out.println(getRes(n-1));
	}
	
	static long getRes(int start) {
		long res = 0;
		for(int i=0; i<10; i++) {
			res+=ascent[start][i];
		}
		return res%10007;
	}

}
