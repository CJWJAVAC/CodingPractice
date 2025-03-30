package Silver04;

import java.util.Scanner;
import java.util.Stack;

public class Parenthesis {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Stack<Character> vps = new Stack<>();
		
		int n = scan.nextInt();
		
		for(int i=0; i<n; i++) {
			boolean v = true;
			vps.clear();
			String str = scan.next();
			for(int j=0; j<str.length(); j++) {
				char ch=str.charAt(j);
				if(ch=='(')
					vps.push(ch);
				else if(ch==')') {
					if(vps.size()==0) {
						v=false;
						break;}
					vps.pop();
				}
			}
			if(vps.size()==0 && v==true)
				System.out.println("YES");
			else if(vps.size()==0 && v==false)
				System.out.println("NO");
			else if(vps.size()!=0 && v==true)
				System.out.println("NO");
			
		}
	}

}
