package Silver05;

import java.util.Scanner;

public class Dday {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int tyear = scan.nextInt();
		int tmonth = scan.nextInt();
		int tday = scan.nextInt();
		
		int dyear = scan.nextInt();
		int dmonth = scan.nextInt();
		int dday = scan.nextInt();
		
		if(dyear-tyear>1000 || dyear-tyear==1000 && (dmonth>tmonth || dmonth==tmonth && dday>=tday)) {
			System.out.println("gg");
		}else {
		int dif = years(dyear,dmonth,dday)-years(tyear,tmonth,tday);
		System.out.println("D-"+dif);
		}
	}
	
	static int years(int y, int m, int d) {
		int[] mdays = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		int this_day=0;
		for(int i=1; i<y; i++) {
			this_day+=365+checkYears(i);
		}
		for(int i=1; i<m; i++) {
			if(i==2) {
				this_day+=mdays[i]+checkYears(y);
				continue;
			}
			this_day+=mdays[i];
		}
		this_day+=d;
		return this_day;
	}
	
	static int checkYears(int a) {
		if(a%4==0) {
			if(a%100==0) {
				if(a%400==0) {
					return 1;
				}
				return 0;
			}
			return 1;
		}
		return 0;
	}
	
}
