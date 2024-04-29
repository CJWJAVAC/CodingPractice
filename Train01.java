package Bronze03;

import java.util.Scanner;

public class Train01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int people = 0;
		int max=0;
		for(int i=0; i<4; i++) {
			int out = scan.nextInt();
			int in = scan.nextInt();
			if(people<out)
				break;
			if(i==0)
				if(out!=0)
					break;
			if(i==3)
				if(in!=0)
					break;
			people-=out;
			people+=in;
			if(max<people)
				max=people;
		}
		System.out.println(max);
	}

}
