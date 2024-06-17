package Silver02;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class StackSequence {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Stack<Integer> st = new Stack<>();
		StringBuilder sb = new StringBuilder();
		
		int n = scan.nextInt();
		
		boolean [] used = new boolean[n];
		int now = 0;
		
		for(int a=0; a<n; a++) {
			int num = scan.nextInt();
			if(now < num) {
				for(int i=now; i<num; i++) {
					if(used[i]) {
						continue;
					}
					st.push(i+1);
					sb.append("+"+"\n");
				}
				st.pop();
				sb.append("-"+"\n");
				now = num-1;
			}
			else {
				if(st.peek()!=num) {
					System.out.println("NO");
					System.exit(0);
				}
				st.pop();
				sb.append("-"+"\n");
				now = num-1;
			}
			used[num-1] = true;
		}
		
		System.out.println(sb);
	}

}
