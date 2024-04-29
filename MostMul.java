package Bronze01;

import java.util.Scanner;

public class MostMul {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num[] = new int[5];
		for(int i=0; i<num.length; i++) {
			num[i]=scan.nextInt();
		}
		int mul = 0;
		int check=0;
		while(true) {
			mul++;
		for(int i=0; i<5; i++) {
			if(mul%num[i]==0) 
				check++;
		}
			if(check>=3) 
				break;
		check=0;
		}
		System.out.println(mul);
	}
}

