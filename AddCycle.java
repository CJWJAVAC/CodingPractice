package Bronze01;

import java.util.Scanner;

public class AddCycle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int result = num;
		int count=0;
		while(true) {
			int k = num/10 + num%10;
			num = (num%10)*10 + k%10;
			count++;
			if(num==result) {
				break;
			}
		}
		System.out.println(count);
	}

}
