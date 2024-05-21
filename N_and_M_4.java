package Silver03;

import java.util.ArrayList;
import java.util.Scanner;

public class N_and_M_4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<ArrayList<Integer>> result = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		int [] num = new int[n];
		
		for(int i=0; i<n; i++) {
			num[i] = i+1;
		}
		
		premute(num, result, new ArrayList<>(), m);
		
		for(ArrayList<Integer> list : result) {
			for(int i=0; i<list.size(); i++) {
				if(i>0) sb.append(" ");
				sb.append(list.get(i));
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
	
	private static void premute(int[] num, ArrayList<ArrayList<Integer>> result, ArrayList<Integer> current, int m) {
		if(current.size() == m) {
			if(isAscend(current)) {
				result.add(new ArrayList<>(current));
				return;
			}
		}
		
		if(current.size() > m || !isAscend(current)) {
			return;
		}
		for(int i=0; i<num.length; i++) {
			current.add(num[i]);
			premute(num, result, current, m);
			current.remove(current.size()-1);
		}
	}
	
	private static boolean isAscend(ArrayList<Integer> current) {
		for(int i=0; i<current.size()-1; i++) {
			if(current.get(i)>current.get(i+1)) {
				return false;
			}
		}
		return true;
	}

}