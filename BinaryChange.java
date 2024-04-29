package Bronze01;

import java.math.BigInteger;
import java.util.Scanner;

public class BinaryChange {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
//		BigInteger n = new BigInteger(str,2);
//		String res = n.toString(8);
//		System.out.println(res);
		int result=0;
		double res = 0;
		StringBuilder sb = new StringBuilder();
		int count=0;
		int ten = 0;
		for(int i=str.length(); i>0; i--) {
			if(count>2) {
				count=0;
				result=0;
				ten++;
			}
			int s = str.charAt(i-1)-'0';
			result+=s*Math.pow(2,count);
			if(count==2 || i==1) {
			res += result*Math.pow(10, ten);
			}
			count++;
		}
		System.out.println((int)res);
	}

}
