package Bronze03;

import java.math.BigInteger;
import java.util.Scanner;

public class Sign {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		for(int i=0; i<3; i++) {
			int n=scan.nextInt();
//			long result=0;
//			long a=0;
			BigInteger a = new BigInteger("0");
			for(int j=0; j<n; j++) {
				a=a.add(scan.nextBigInteger());
			}
			if(a.compareTo(BigInteger.ZERO)==-1)
				System.out.println("-");
			else if(a.compareTo(BigInteger.ZERO)==1)
				System.out.println("+");
			else
				System.out.println(0);
	}
	}
}


