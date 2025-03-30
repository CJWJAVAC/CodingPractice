package Silver02;

import java.util.*;

public class N_and_M_12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[] num = new int[n];
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<n; i++) {
			num[i] = scan.nextInt();
		}
		
		Arrays.sort(num);
		Set<String> set = new HashSet<>();
		permute(num,new ArrayList<>(),sb,m,set,0);
		
		System.out.println(sb);
		
	}
	static void permute(int[] num, ArrayList<Integer> current, StringBuilder sb, int m, Set<String> set,int start) {
		if(current.size()==m) {
			String res = current.toString();
			if(!set.contains(res)) {
				set.add(res);
				for(int next : current) {
					sb.append(next+" ");
				}
				sb.append("\n");
			}
			return;
		}
		
		for(int i=start; i<num.length; i++) {
			current.add(num[i]);
			permute(num,current,sb,m,set,i);
			current.remove(current.size()-1);		
		}
	}
	
}
