package Silver02;

import java.util.ArrayList;
import java.util.Scanner;

public class MissingParen {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		
		String [] s = str.split("-");
		int res = 0;
		
		for(int i=0; i<s.length; i++) {
			String[] s1 = s[i].split("\\+");
			int sum = 0;
			for(int j=0; j<s1.length; j++) {
				sum+=Integer.parseInt(s1[j]);
			}
			if(i==0) {
				res+=sum;
			}else {
				res-=sum;
			}
		}
		System.out.println(res);
	}

}
