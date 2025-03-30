package Silver02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class CoordinateCompression {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		
		int n = scan.nextInt();
		int [] num = new int[n];
		
		for(int i=0; i<n; i++) {
			int a = scan.nextInt();
			list.add(a);
			num[i] = a;
		}
		
		ArrayList<int[]> indexList = new ArrayList<>();
		for(int i=0; i<list.size(); i++) {
			indexList.add(new int[] {list.get(i),i});
		}
		
		Collections.sort(indexList, new Comparator<int[]>() {
			public int compare(int[] i1, int[] i2) {
				return Integer.compare(i1[0], i2[0]);
			}
		});
		
		int preEnt = indexList.get(0)[0];
		int current = 0;
		for(int[] ent : indexList) {
			if(ent[0]!=preEnt) {
				current++;
				preEnt = ent[0];
			}
			ent[0] = current;
		}
		
		for(int i=0; i<indexList.size(); i++) {
			int j = indexList.get(i)[0];
			int k = indexList.get(i)[1];
			
			num[k] = j;
		}
		
		for(int a : num) {
			sb.append(a+" ");
		}
		System.out.println(sb);
	}

}
