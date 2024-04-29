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
			hashset.add(scan.next());//중복 제거하면서 입력받음
		}
		
		ArrayList<String> arr = new ArrayList<String>(hashset);//hashset으로 입력받은 정보를 arraylist에 저장
		Collections.sort(arr);//알파벳순으로 정렬
		String [] str = arr.toArray(new String[arr.size()]);//정렬된 arraylist str배열로 보냄(길이순 정렬을 위해서) 
		
		Arrays.sort(str, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.length()-o2.length();//길이순으로 정렬하는 comparator
			}
		});
		
		for(int i = 0; i<str.length; i++) {
			System.out.println(str[i]);
		}
	}
}


