package Silver03;

import java.util.Scanner;

public class Tile01 {
	
	static long num[];

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		num = new long[n+1];
		
		long result = Tile(n);
		
		System.out.println(result);
	}

	private static long Tile(int n) {
		if(n==1) {
			return 1;
		}
		else if(n==2) {
			return 2;
		}
		
		num[1] = 1;
		num[2] = 2;
		
		for(int i=3; i<=n; i++) {
			num[i] = (num[i-1] + num[i-2])%15746;
		}
		
		return num[n];
	}
	
}
