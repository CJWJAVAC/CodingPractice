package Silver03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class N_and_M_5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		int[] num = new int[n];
		for(int i=0; i<n; i++) {
			num[i] = scan.nextInt();
		}
		
		Arrays.sort(num);
		
		Premute(list,new ArrayList<>(),num,m);
		
		for(ArrayList<Integer> nums : list) {
			for(int i=0; i<nums.size(); i++) {
				if(i==0) {
					sb.append(nums.get(i));
				}else {
					sb.append(" "+nums.get(i));
				}
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
		
	}

	private static void Premute(ArrayList<ArrayList<Integer>> list, ArrayList<Integer> current, int num[], int m) {
		if(current.size() == m) {
			list.add(new ArrayList<>(current));
			return;
		}
		
		for(int i=0; i<num.length; i++) {
			if(current.contains(num[i])) {
				continue;
			}
			current.add(num[i]);
			Premute(list,current,num,m);
			current.remove(current.size()-1);
		}
	}
	
}
