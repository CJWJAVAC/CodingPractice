package Silver01;

import java.util.*;

public class NewImployer {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int t = scan.nextInt();
		
		for(int i=0; i<t; i++) {
			int n = scan.nextInt();
			int imployer[] = new int[n+1];
			
			for(int j=0; j<n; j++) {
				int paper = scan.nextInt();
				int meeting = scan.nextInt();
				imployer[paper] = meeting;
			}
			
			int count = 1;
			int check = imployer[1];
			for(int k=2; k<=n; k++) {
				if(imployer[k]<check) {
					check = imployer[k];
					count++;
				}
			}
			sb.append(count+"\n");
		}
		System.out.println(sb);
	}
	
}
