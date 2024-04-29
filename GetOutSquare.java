package Bronze03;

import java.util.Scanner;

public class GetOutSquare {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x=scan.nextInt();
		int y=scan.nextInt();
		int w=scan.nextInt();
		int h=scan.nextInt();
		int wlen=0;
		int hlen=0;
		int result=0;
		if(w-x<x)
			wlen=w-x;
		if(w-x>x)
			wlen=x;//
		if(w-x==x)
			wlen=x;
		if(h-y<y)
			hlen=h-y;
		if(h-y>y)
			hlen=y;//1
		if(h-y==y)
			hlen=y;
		if(wlen==hlen)
			result=wlen;
		if(wlen>hlen)
			result=hlen;
		if(wlen<hlen)
			result=wlen;
		System.out.println(result);
	}

}
