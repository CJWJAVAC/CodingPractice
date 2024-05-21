package Silver03;

import java.util.ArrayList;
import java.util.Scanner;

public class N_and_M {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<ArrayList<Integer>> result = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[] num = new int[n];
		
		for(int i=0; i<n; i++) {
			num[i] = i+1;
		}
		
		permute(num, result, new ArrayList<>(), m);
		
		for(ArrayList<Integer> list : result) {
			for(int i=0; i<list.size(); i++) {
				if(i>0) sb.append(" ");
				sb.append(list.get(i));
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
	
	private static void permute(int num[], ArrayList<ArrayList<Integer>> result, ArrayList<Integer> current, int m) {
		if(current.size() == m) {
			result.add(new ArrayList<>(current));
			return;
		}
		
		for(int i=0; i<num.length; i++) {
			if(current.contains(num[i])) {
				continue;
			}
			current.add(num[i]);
			permute(num,result,current,m);
			current.remove(current.size()-1);
		}
	}

}
