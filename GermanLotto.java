package Silver02;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class GermanLotto {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			list.clear();
			int k = scan.nextInt();
			if(k==0) {
				break;
			}
			for(int i=0; i<k; i++) {
				list.add(scan.nextInt());
			}
			List<List<Integer>> per = generatePermute(list,6);
			for(List<Integer> permute : per) {
				for(int j=0; j<permute.size(); j++) {
					sb.append(permute.get(j)+" ");
				}
				sb.append("\n");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}

	static List<List<Integer>> generatePermute(ArrayList<Integer> list, int k) {
		List<List<Integer>> result = new ArrayList<>();
		getPermute(list, 0, k, new ArrayList<>(), result);
		return result;
	}
	
	static void getPermute(ArrayList<Integer> list, int start, int k, List<Integer> current, List<List<Integer>> result) {
		if(current.size()==k) {
			result.add(new ArrayList<>(current));
			return;
		}
		
		for(int i=start; i<list.size(); i++) {
			current.add(list.get(i));
			getPermute(list, i+1, k, current,result);
			current.remove(current.size()-1);
		}
	}
}
