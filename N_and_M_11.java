package Silver02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class N_and_M_11 {
	
	static int n,m;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		n = scan.nextInt();
		m = scan.nextInt();
		int[] num = new int[n];
		
		for(int i=0; i<n; i++) {
			num[i] = scan.nextInt();
		}
		
		Arrays.sort(num);
		Set<String> set = new HashSet<>();
		ArrayList<Integer> list = new ArrayList<>();
		
		permute(num,set,list,sb);
		System.out.println(sb);
	}

	static void permute(int[] num, Set<String> set, ArrayList<Integer> list, StringBuilder sb ) {
		if(list.size()==m) {
			String str = list.toString();
			if(!set.contains(str)) {
				set.add(str);
				
				for(int next : list) {
					sb.append(next+" ");
				}
				sb.append("\n");
			}
			return;
		}
		
		for(int i=0; i<n; i++) {
			list.add(num[i]);
			permute(num,set,list,sb);
			list.remove(list.size()-1);
		}
	}
	
}
