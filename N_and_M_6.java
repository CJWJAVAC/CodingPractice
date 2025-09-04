package Silver03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class N_and_M_6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		StringBuilder sb = new StringBuilder();
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[] num = new int[n];
		
		for(int i=0; i<n; i++) {
			num[i] = scan.nextInt();
		}
		
		Arrays.sort(num);
		
		permute(num,list,new ArrayList<Integer>(),m,0);
		
		for(ArrayList<Integer> result : list) {
			for(int i=0; i<result.size(); i++) {
				sb.append(result.get(i)+" ");
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
	
	static void permute(int[] num, ArrayList<ArrayList<Integer>> list, ArrayList<Integer> current, int m, int start) {
		if(current.size() == m) {
			list.add(new ArrayList<Integer>(current));
			return;
		}
		
		for(int i=start; i<num.length; i++) {
			current.add(num[i]);
			permute(num,list,current,m,i+1);
			current.remove(current.size()-1);
		}
	}
	
}
