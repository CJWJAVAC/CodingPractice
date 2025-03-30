package Silver01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StartLink {
	
	static int n;
	static int minDiff = Integer.MAX_VALUE;
	static int total=0;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		int[][] act = new int[n][n];
		
		for(int i=0; i<n; i++) {
			String[] str = br.readLine().split(" ");
			for(int j=0; j<n; j++) {
				act[i][j] = Integer.parseInt(str[j]);
				total += act[i][j]; 
			}
		}
		
		boolean[] visited = new boolean[n];
		
		getMininum(act,0,0,visited);
		System.out.println(minDiff);
	}

	static void getMininum(int[][] act, int index, int count, boolean[] visited) {
		if(count==n/2) {
			calculateAct(act,visited);
			return;
		}
		
		for(int i=index; i<n; i++) {
			if(!visited[i]) {
				visited[i] = true;
				getMininum(act, index+1, count+1, visited);
				visited[i] = false;
			}
		}
	}
	
	static void calculateAct(int[][] act, boolean[] visited) {
		int start = 0;
		int link = 0;
		
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if(visited[i] && visited[j]) {
					start+=act[i][j] + act[j][i];
				}
			}
		}
		
		link = total-start;
		int difference = Math.abs(start-link);
		minDiff = Math.min(difference, minDiff);
	}

}
