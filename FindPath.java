package Silver01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindPath {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		int[][] list = new int[n][n];
		
		for(int i=0; i<n; i++) {
			String[] str = br.readLine().split(" ");
			for(int j=0; j<n; j++) {
				list[i][j] = Integer.parseInt(str[j]);
			}
		}
		
		for(int k=0; k<n; k++) {//거쳐가는 노드
			for(int i=0; i<n; i++) {//출발
				for(int j=0; j<n; j++) {//도착
					if(list[i][k]==1 && list[k][j]==1) {
						list[i][j] = 1;
					}
				}
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				sb.append(list[i][j]+" ");
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
	}

}
