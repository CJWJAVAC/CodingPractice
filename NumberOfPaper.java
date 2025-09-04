package Silver02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NumberOfPaper {
	
	static int minusOne=0;
	static int zero=0;
	static int one=0;
	static int[][] paper;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		paper = new int[n][n];
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine()," ");
			for(int j=0; j<n; j++) {
				paper[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		mergeSort(0,0,n);
		
		sb.append(minusOne+"\n"+zero+"\n"+one);
		System.out.println(sb);
	}

	static void mergeSort(int row, int col, int size) {
		if(check(row, col, size)) {
			if(paper[row][col]==-1) {
				minusOne++;
			}
			else if(paper[row][col]==0) {
				zero++;
			}
			else {
				one++;
			}
			return;
		}
		
		int newSize = size/3;
		
		for (int i = 0; i < 3; i++) {
		    for (int j = 0; j < 3; j++) {
		        mergeSort(row + i * newSize, col + j * newSize, newSize);
		    }
		}
	}
	
	
	static boolean check(int row, int col, int size) {
		int num = paper[row][col];
		
		for(int i=row; i<row+size; i++) {
			for(int j=col; j<col+size; j++) {
				if(paper[i][j]!=num) {
					return false;
				}
			}
		}
		return true;
	}
}
