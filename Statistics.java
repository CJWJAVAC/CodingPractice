package Silver03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Statistics {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		
		int n = scan.nextInt();
		
		for(int i=0; i<n; i++) {
			int m = scan.nextInt();
			list.add(m);
		}
		
		sb.append((int)Arith(list)+"\n");
		sb.append(middle(list)+"\n");
		sb.append(Frequent(list)+"\n");
		sb.append(Round(list)+"\n");
		
		System.out.println(sb);
	}

	private static double Arith(ArrayList<Integer> list) {
		int sum = 0;
		int leng = list.size();
		
		for(int i : list) {
			sum+=i;
		}
		
		double res = (double)sum/leng;
		
		return Math.round(res);
	}
	
	private static int middle(ArrayList<Integer> list) {
		Collections.sort(list);
		
		int len = list.size()/2;
		
		return list.get(len);
	}
	
	private static int Frequent(ArrayList<Integer> list) {
		Map<Integer, Integer> frequencyMap = new HashMap<>();
		
		for(int num : list) {
			if(frequencyMap.containsKey(num)) {
				frequencyMap.put(num, frequencyMap.get(num)+1);
			}
			else {
				frequencyMap.put(num,1);
			}
		}
		
		int max = 0;
		ArrayList<Integer> maxKey = new ArrayList<>();
		
		for(Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
			if(entry.getValue() > max) {
				max = entry.getValue();
				maxKey.clear();
				maxKey.add(entry.getKey());
			}
			else if(entry.getValue() == max) {
				maxKey.add(entry.getKey());
			}
		}
		
		Collections.sort(maxKey);
		
		if(maxKey.size()>1) {
			return maxKey.get(1);
		}
		else {
			return maxKey.get(0);
		}
	}
	
	private static int Round(ArrayList<Integer> list) {
		Collections.sort(list);
		
		int res = list.get(list.size()-1)-list.get(0);
		
		return res;
	}
}
