package Silver05;

import java.util.Scanner;

public class Polyomino {

	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		char[] ch = new char[50];
//		int count = 0;
//		String str = scan.nextLine();
//		
//		String MyStr = str.replace(".", "");
//		if(MyStr.length()%2!=0 || MyStr.length()==0) {
//			System.out.println("-1");
//			System.exit(0);
//		}
//		
//		for(int i=0; i<str.length(); i++) {
//			ch[i]=str.charAt(i);
//		}
//		
//		for(int i=0; i<ch.length; i++) {
//			if(ch[i]=='X') {
//				count++;
//				if(count%4==0) {
//					for(int j=i-3; j<=i; j++) {
//						ch[j]='A';
//					}
//				}
//				if(count%4==2) {
//					for(int k=i-1; k<=i; k++) {
//						ch[k]='B';
//					}
//				}
//			}
//			if(ch[i]=='.') {
//				if(count%2!=0) {
//					System.out.println("-1");
//					System.exit(0);
//				}
//				count = 0;
//			}
//		}
//		
//		for(int m=0; m<ch.length; m++) {
//			System.out.print(ch[m]);
//		}
		
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		
		str = str.replace("XXXX", "AAAA");
		str = str.replace("XX", "BB");
		if(str.contains("X")) {
			System.out.println("-1");
		}
		else {
			System.out.println(str);
		}
	}

}
