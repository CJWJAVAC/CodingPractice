package Bronze01;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			int n = scan.nextInt();
			if(n==0) {
				break;
			}
			String s = n+"";
			String s1 = "";
			for(int i=s.length()-1; i>=0; i--) {
				s1+=s.charAt(i);
			}
			if(s.equals(s1)) {
				System.out.println("yes");
			}else {
				System.out.println("no");
			}
		}
	}

}
