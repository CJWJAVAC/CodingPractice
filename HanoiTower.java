package Gold05;

import java.util.Scanner;

public class HanoiTower {
	
	static int count = 0;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int n = scan.nextInt();
		
		hanoi(n,1,3,2,sb);
		System.out.println(count+"\n"+sb);
	}

	static void hanoi(int n, int from, int to, int trans, StringBuilder sb) {
		if(n==1) {
			sb.append(from+" "+to+"\n");
			count++;
			return;
		}
		
		hanoi(n-1,from,trans,to,sb);
		sb.append(from+" "+to+"\n");
		count++;
		hanoi(n-1,trans,to,from,sb);
	}
	
}
