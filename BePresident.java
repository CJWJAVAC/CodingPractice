package Bronze01;

import java.util.Scanner;

public class BePresident {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T=scan.nextInt();
		int [][] arr = new int[15][15];
		for(int i=0; i<15; i++) {
			for(int j=0; j<15; j++) {
				if(i==0) {
					arr[i][j]=j;
				}
				else {
					for(int k=0; k<=j; k++) {
						arr[i][j]+=arr[i-1][k];
					}
				}
			}
		}
		for(int i=0; i<T; i++) {
			int k=scan.nextInt();
			int n=scan.nextInt();
			System.out.println(arr[k][n]);
		}
	}

}
