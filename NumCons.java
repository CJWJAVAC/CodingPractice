package Bronze03;

import java.util.Scanner;

public class NumCons {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int width_a=0; 
		int height_a=0;
		int width_b=0;
		int height_b=0;
		int a,b;
		a=scan.nextInt();
		b=scan.nextInt();
		if(a%4==0)
			height_a=1;
		else
			height_a=5-a%4;
		for(int i=1; i<=2500000; i++) {
			if(a>=(4*(i-1)+1)&&a<=(4*(i-1)+4))
				width_a=i;
		}
		if(b%4==0)
			height_b=1;
		else
			height_b=5-b%4;
		for(int i=1; i<=2500000; i++) {
			if(b>=(4*(i-1)+1)&&b<=(4*(i-1)+4))
				width_b=i;
		}
		int dis_w=0;
		int dis_h=0;
		if(width_a>width_b)
			dis_w=width_a-width_b;
		else if(width_a<width_b)
			dis_w=width_b-width_a;
		else if(width_a==width_b)
			dis_w=0;
		if(height_a>height_b)
			dis_h=height_a-height_b;
		else if(height_a<height_b)
			dis_h=height_b-height_a;
		else if(height_a==height_b)
			dis_h=0;
		System.out.println(dis_w+dis_h);
	}

}
