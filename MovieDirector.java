package Silver05;

import java.util.Scanner;

public class MovieDirector {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int count=1;
		int title = 666;
		while(count<=N) {
			if(N==count) {
				System.out.println(title);
				break;
			}
			title++;
			String str = title+"";
			if(str.contains("666")) {
				count++;
			}
		}
	}

}
