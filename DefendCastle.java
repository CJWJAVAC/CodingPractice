package Bronze01;

import java.util.Scanner;

public class DefendCastle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int count = 0;
		int max = 0;
		String [] str = new String[n];
		for(int i=0; i<n; i++) {
			str[i] = scan.next();
			if(!str[i].contains("X")) {
				count++;
			}
		}
		max=count;
		count=0;
		String [] first = new String[m];
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
			first[i]+=str[j].charAt(i);
		}
			if(!first[i].contains("X")) {
				count++;
			}
		}
		if(max<count)
			max=count;
		System.out.println(max);
		}
	}


