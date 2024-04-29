package Bronze02;

import java.util.Scanner;

public class Resistance {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String resist1 = scan.next();
		String resist2 = scan.next();
		String resist3 = scan.next();
		long tenth=0;
		long oneth=0;
		long mul=0;
		switch(resist1) {
			case "black": tenth=0;
				break;
			case "brown": tenth=10;
				break;
			case "red" : tenth=20;
				break;
			case "orange" : tenth=30;
				break;
			case "yellow" : tenth=40;
				break;
			case "green" : tenth=50;
				break;
			case "blue" : tenth=60;
				break;
			case "violet" : tenth=70;
				break;
			case "grey" : tenth=80;
				break;
			case "white" : tenth=90;
				break;
		}
		switch(resist2) {
			case "black": oneth=0;
				break;
			case "brown": oneth=1;
				break;
			case "red" : oneth=2;
				break;
			case "orange" : oneth=3;
				break;
			case "yellow" : oneth=4;
				break;
			case "green" : oneth=5;
				break;
			case "blue" : oneth=6;
				break;
			case "violet" : oneth=7;
				break;
			case "grey" : oneth=8;
				break;
			case "white" : oneth=9;
				break;
		}
		switch(resist3) {
			case "black": mul=1;
				break;
			case "brown": mul=10;
				break;
			case "red" : mul=100;
				break;
			case "orange" : mul=1000;
				break;
			case "yellow" : mul=10000;
				break;
			case "green" : mul=100000;
				break;
			case "blue" : mul=1000000;
				break;
			case "violet" : mul=10000000;
				break;
			case "grey" : mul=100000000;
				break;
			case "white" : mul=1000000000;
				break;
		}
		long res = (tenth+oneth)*mul;
		System.out.println(res);
	}

}
