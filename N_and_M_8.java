package Silver03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class N_and_M_8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> current = new ArrayList<Integer>();
		StringBuilder sb = new StringBuilder();
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[] num = new int[n];
		
		for(int i=0; i<n; i++) {
			num[i] = scan.nextInt();
		}
		
		Arrays.sort(num);
		
		permute(num,result,current,m,0);
		
		for(ArrayList<Integer> list : result) {
			for(int number : list) {
				sb.append(number+" ");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
	
	static void permute(int[] num, ArrayList<ArrayList<Integer>> result, ArrayList<Integer> current, int m, int start) {
		if(current.size() == m) {
			result.add(new ArrayList<Integer>(current));
			return;
		}
		
		for(int i=start; i<num.length; i++) {
			current.add(num[i]);
			permute(num,result,current,m,start);
			current.remove(current.size()-1);
			start+=1;
		}
	}
}
