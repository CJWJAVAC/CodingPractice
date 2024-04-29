package Bronze01;

import java.util.Scanner;
import java.util.regex.Pattern;

public class BiggestMinsu {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int count=0;
		int max=0;
		while(count<=n) {
			String s = count+"";
			if(Pattern.matches("^[47]*$",s)) {
				max=Integer.parseInt(s);
			}
			count++;
		}
		System.out.println(max);
	}

}
