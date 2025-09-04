package Silver02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class KinshipCal {
	
	static boolean [] visited;
	static int[] num;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		
		int n = scan.nextInt();
		int a = scan.nextInt();
		int b = scan.nextInt();
		visited = new boolean[n+1];
		num = new int[n+1];
		Arrays.fill(num, -1);
		
		int m = scan.nextInt();
		for(int i=0; i<=n; i++) {
			list.add(new ArrayList<>());
		}
		
		for(int i=0; i<m; i++) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			list.get(x).add(y);
			list.get(y).add(x);
		}
				
		int res=0;
		
		dfs(list,a,res);
		
		System.out.println(num[b]);
	}

	static void dfs(ArrayList<ArrayList<Integer>> list, int start,int res) {
		visited[start] = true;
		num[start] = res;
		
		for(int next : list.get(start)) {
			if(!visited[next]) {
				dfs(list,next,num[start]+1);
			}
		}
	}
	
}
