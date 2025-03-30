package Silver02;

import java.util.ArrayList;
import java.util.Scanner;

public class PartialSequence {
	
	static int res;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> elements = new ArrayList<>();
		
		int n = scan.nextInt();
		int s = scan.nextInt();
		
		for(int i=0; i<n; i++) {
			elements.add(scan.nextInt());
		}
		
		ArrayList<ArrayList<Integer>> list = Combinations(elements);
		
		for(ArrayList<Integer> combi : list) {
			int sum = 0;
			for(int next : combi) {
				sum+=next;
			}
			if(sum==s) {
				res++;
			}
		}
		System.out.println(res);
	}
	
	static ArrayList<ArrayList<Integer>> Combinations(ArrayList<Integer> elements) {
		ArrayList<ArrayList<Integer>> combi = new ArrayList<>();
		
		for(int i=1; i<=elements.size(); i++) {
			generateCombi(elements, i, 0, new ArrayList<>(), combi);
		}
		
		return combi;
	}
	
	static void generateCombi(ArrayList<Integer> elements, int a, int start, ArrayList<Integer> currentCombi, ArrayList<ArrayList<Integer>> allCombi) {
		if(currentCombi.size()==a) {
			allCombi.add(new ArrayList<>(currentCombi));
			return;
		}
		
		for(int i=start; i<elements.size(); i++) {
			currentCombi.add(elements.get(i));
			generateCombi(elements, a, i+1, currentCombi, allCombi);
			currentCombi.remove(currentCombi.size()-1);
		}
	}
}
