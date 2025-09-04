package Silver01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QuadTree {
	
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int[][] tree = new int[n][n];
		
		for(int i=0; i<n; i++) {
			String[] str = br.readLine().split("");
			for(int j=0; j<n; j++) {
				tree[i][j] = Integer.parseInt(str[j]);
			}
		}
		
		TreeDivide(tree,0,0,n);
		
		System.out.println(sb);
	}

	static void TreeDivide(int[][] tree, int row, int col, int size) {
		if(checkTree(tree, row, col, size)) {
			if(tree[row][col]==0) {
				sb.append("0");
			}else {
				sb.append("1");
			}
			return;
		}else {
			sb.append("(");
		}
		
		int newSize= size/2;
		TreeDivide(tree,row,col,newSize);
		TreeDivide(tree,row,col+newSize,newSize);
		TreeDivide(tree,row+newSize,col,newSize);
		TreeDivide(tree,row+newSize,col+newSize,newSize);
		
		sb.append(")");
	}
	
	static boolean checkTree(int[][] tree, int row, int col, int size) {
		int num = tree[row][col];
		for(int i=row; i<row+size; i++) {
			for(int j=col; j<col+size; j++) {
				if(tree[i][j]!=num) {
					return false;
				}
			}
		}
		
		return true;
	}
	
}
