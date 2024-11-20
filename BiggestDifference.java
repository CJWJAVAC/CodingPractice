package Silver02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BiggestDifference {
	
	static int max=0;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		int[] num = new int[n];
		
		st = new StringTokenizer(br.readLine()," ");
		
		for(int i=0; i<n; i++) {
			num[i] = Integer.parseInt(st.nextToken());
		}
		
		boolean[] visited = new boolean[n];
		maxPermutation(num,visited,new int[n],0);
		
		System.out.println(max);
	}

	static void maxPermutation(int[] num, boolean[] visited, int[] res, int a) {
		if(a==num.length) {
			int sum = maxDif(res);
			if(sum>max) {
				max = sum;
			}
			return;
		}
		
		for(int i=0; i<num.length; i++) {
			if(!visited[i]) {
				visited[i] = true;
				res[a] = num[i];
				maxPermutation(num,visited,res,a+1);
				visited[i] = false;
			}
		}
	}
	
	static int maxDif(int[] num) {
		int sum = 0;
		for(int i=0; i<num.length-1; i++) {
			sum+=Math.abs(num[i]-num[i+1]);
		}
		return sum;
	}
	
}
