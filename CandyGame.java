package Silver02;

import java.util.Scanner;

public class CandyGame {
	
	static int n;
	static char[][] ch;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		n = scan.nextInt();
		ch = new char[n][n];
		scan.nextLine();
		
		for(int i=0; i<n; i++) {
			String s = scan.nextLine();
			for(int j=0; j<n; j++) {
				ch[i][j] = s.charAt(j);
			}
		}
		
		int res = findMaxCandy(ch);
		System.out.println(res);
	}
	
	static int findMaxCandy(char[][] ch) {
		int result = 0;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(j+1<n) {
					swap(i,j,i,j+1);
					result = Math.max(result, getCandy(ch));
					swap(i,j,i,j+1);
				}
				
				if(i+1<n) {
					swap(i,j,i+1,j);
					result = Math.max(result, getCandy(ch));
					swap(i,j,i+1,j);
				}
			}
		}
		
		return result;
	}
	
	static void swap(int x, int y, int change, int change2) {
		char c = ch[x][y];
		ch[x][y] = ch[change][change2];
		ch[change][change2] = c;
	}
	
	static int getCandy(char[][] ch) {
		int current=1;
		
		for(int i=0; i<n; i++) {
			int count = 1;
			for(int j=1; j<n; j++) {
				if(ch[i][j]==ch[i][j-1]) {
					count++;
				}else {
					current = Math.max(current, count);
					count=1;
				}
			}
			current = Math.max(current, count);
		}
		
		
		for(int i=0; i<n; i++) {
			int count=1;
			for(int j=1; j<n; j++) {
				if(ch[j][i]==ch[j-1][i]) {
					count++;
				}else {
					current = Math.max(current, count);
					count=1;
				}
			}
			current = Math.max(current, count);
		}
		
		return current;
	}
}
	
