package Silver05;

import java.util.Scanner;

public class Stick {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int temp=x;
		int count=0;
		int stick = 64;
		while(true) {
			if(stick<=temp){
				temp-=stick;
				count++;
				if(temp==0) {
					break;
				}
			}
			stick=stick/2;
		}
		System.out.println(count);
	}

}
