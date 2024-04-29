package Bronze01;

import java.util.Scanner;

public class TurnAdd {
	
	public static int Rev(int a) {
		String s = a+"";
		String s1 = "";
		for(int i=s.length()-1; i>=0; i--) {
			s1+=s.charAt(i);
		}
		int res = Integer.parseInt(s1);
		return res;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int X = scan.nextInt();
		int Y = scan.nextInt();
		int result = Rev(Rev(X)+Rev(Y));
		System.out.println(result);
	}
	
	
}

	
