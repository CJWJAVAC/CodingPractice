package Silver02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class NLargestNumber {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
		
		int n = Integer.parseInt(br.readLine());
		int[][] num = new int[n][n];
		
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			for(int j=0; j<n; j++) {
				num[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i=n-1; i>=0; i--) {
			for(int j=0; j<n; j++) {
				queue.add(num[i][j]);
			}
			if(i==0) {
				break;
			}
			queue.poll();
		}
		System.out.println(queue.poll());
	}

}
