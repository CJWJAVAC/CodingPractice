package Silver04;

import java.util.Scanner;
import java.util.Stack;

public class StackPractice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Stack<Integer> st = new Stack<>();
		StringBuilder sb = new StringBuilder();
		
		int n = scan.nextInt();
		scan.nextLine();
		
		for(int i=0; i<n; i++) {
			String order = scan.next();
			switch(order) {	
			case "push":
				int value = scan.nextInt();
				st.push(value);
				break;
			case "pop":
				if(st.size()==0) {
					sb.append("-1").append('\n');
					break;
				}
				sb.append(st.pop()).append('\n');
				break;
			case "size":
				sb.append(st.size()).append('\n');
				break;
			case "empty":
				if(st.empty()) {
					sb.append("1").append('\n');
					break;}
				else {
					sb.append("0").append('\n');
					break;}
			case "top":
				if(st.size()==0) {
					sb.append("-1").append('\n');
					break;
				}
				sb.append(st.peek()).append('\n');
				break;
			}
		}
		System.out.println(sb);
	}

}
