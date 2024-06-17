package Silver02;

import java.util.Scanner;
import java.util.Stack;

public class IronStick {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Stack<Character> st = new Stack<>();
		
		String str = scan.next();
		int res = 0;
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)=='(') {
				st.push('(');
			}else if(str.charAt(i)==')') {
				st.pop();
				if(str.charAt(i-1)=='(') {
					res+=st.size();
				}
				else {
					res+=1;
				}
			}
		}
		System.out.println(res);
	}

}
