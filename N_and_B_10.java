package Silver02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class N_and_B_10 {
	
	static int n,m;

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		n = scan.nextInt();
		m = scan.nextInt();
		int[] num = new int[n];
		Set<String> set = new HashSet<>();
		ArrayList<Integer> list = new ArrayList<>();
		boolean[] used = new boolean[n];
		
		for(int i=0; i<n; i++) {
			num[i] = scan.nextInt();
		}
		
		Arrays.sort(num);
		permute(num,set,list,0,sb,used);
		
		System.out.println(sb);
		
	}

	static void permute(int[] num, Set<String> set, ArrayList<Integer> list, int start, StringBuilder sb, boolean[] used) {
		if(list.size()==m) {
			String res = list.toString();
			if(!set.contains(res) && isAsecnd(list)) {
				set.add(res);
				
				for(int next : list) {
					sb.append(next+" ");
				}
				sb.append("\n");
			}
			return;
		}
		
		for(int i=start; i<n; i++) {
			if(used[i]) {
				continue;
			}
			list.add(num[i]);
			used[i] = true;
			permute(num,set,list,start+1,sb,used);
			used[i] = false;
			list.remove(list.size()-1);
		}
	}
	
	static boolean isAsecnd(ArrayList<Integer> list) {
		for(int i=0; i<list.size()-1; i++) {
			if(list.get(i)>list.get(i+1)) {
				return false;
			}
		}
		return true;
	}
}
