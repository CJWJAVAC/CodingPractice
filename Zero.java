package Silver04;

import java.util.Scanner;
import java.util.Stack;

public class Zero {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Stack<Integer> st = new Stack<>();
		
		int k = scan.nextInt();
		int res = 0;
		
		for(int i=0; i<k; i++) {
			int n = scan.nextInt();
			if(n==0) {
				int a = st.pop();
				res-=a;
			}
			else {
				res+=n;
				st.add(n);
			}
		}
		
		System.out.println(res);
	}

}
