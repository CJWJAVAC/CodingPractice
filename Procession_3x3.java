package Silver01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Procession_3x3 {
	
	static int n,m;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = br.readLine().split(" ");
		n = Integer.parseInt(str[0]);
		m = Integer.parseInt(str[1]);
		
		int[][] A = new int[n][m];
		int[][] B = new int[n][m];
		
		for(int i=0; i<n; i++) {
			String str2 = br.readLine().replaceAll("\\s", "");
			String[] line = str2.split("");
			for(int j=0; j<m; j++) {
				A[i][j] = Integer.parseInt(line[j]);
			}
		}
		
		for(int i=0; i<n; i++) {
			String str2 = br.readLine().replace("\\s", "");
			String[] line = str2.split("");
			for(int j=0; j<m; j++) {
				B[i][j] = Integer.parseInt(line[j]);
			}
		}
		
		int result = greed(A,B);
		System.out.println(result);
	}

	static int greed(int[][] A, int[][] B) {
		int count = 0;
		int x = n-3;
		int y = m-3;
		
		if(x < 0 || y < 0) { 
			if(!test(A,B)) {
				return -1;
			}else {
				return 0;
			}
		}
		
		for(int i=0; i<=x; i++) {
			for(int j=0; j<=y; j++) {
				if(A[i][j] != B[i][j]) {
					for(int a=0; a<3; a++) {
						for(int b=0; b<3; b++) {
							if(A[i+a][j+b] == 0) A[i+a][j+b] = 1;
							else A[i+a][j+b] = 0;
						}
					}
					count++;
				}
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(A[i][j] != B[i][j]) return -1;
			}
		}
		
		return count;
	}
	
	static boolean test(int[][] A, int[][] B) {
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(A[i][j] != B[i][j]) return false;
			}
		}
		return true;
	}
}
