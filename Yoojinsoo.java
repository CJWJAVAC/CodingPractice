package Bronze01;

import java.util.Scanner;

public class Yoojinsoo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		String str = N+"";
		int front=1, back=1;
		if(str.length()<2) {
			System.out.println("NO");
		}
		for(int i=0; i<str.length()-1; i++) {
			char c = str.charAt(i);
			int f = c-'0';
			front*=f;
			for(int j=i+1; j<str.length(); j++) {
				char d = str.charAt(j);
				int b = d-'0';
				back*=b;
			}
			if(front==back) {
				System.out.println("YES");
				break;
			}
			if(i==str.length()-2 && front!=back) {
				System.out.println("NO");
			}
			back=1;
		}
	}

}
