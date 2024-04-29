package Silver05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;

public class WordSort {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		HashSet<String> hashset = new HashSet<String>();
		
		for(int i=0; i<N; i++) {
			hashset.add(scan.next());//�ߺ� �����ϸ鼭 �Է¹���
		}
		
		ArrayList<String> arr = new ArrayList<String>(hashset);//hashset���� �Է¹��� ������ arraylist�� ����
		Collections.sort(arr);//���ĺ������� ����
		String [] str = arr.toArray(new String[arr.size()]);//���ĵ� arraylist str�迭�� ����(���̼� ������ ���ؼ�) 
		
		Arrays.sort(str, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.length()-o2.length();//���̼����� �����ϴ� comparator
			}
		});
		
		for(int i = 0; i<str.length; i++) {
			System.out.println(str[i]);
		}
	}
}


