package Silver02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.ListIterator;

public class Editor {
	
	static char ch;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		LinkedList<Character> list = new LinkedList<>();
		ListIterator<Character> iterator = list.listIterator();
		StringBuilder sb = new StringBuilder();
		
		String str = br.readLine();
		for(int a=0; a<str.length(); a++) {
			list.add(str.charAt(a));
		}
		
		int m = Integer.parseInt(br.readLine());
		iterator = list.listIterator(list.size());
		
		for(int i=0; i<m; i++) {
			String input = br.readLine();
			char order = input.charAt(0);
			
			switch(order) {
			case 'L':
				if(iterator.hasPrevious()) {
					iterator.previous();
				}
				break;
				
			case 'D':
				if(iterator.hasNext()) {
					iterator.next();				
					}
				break;
				
			case 'B':
				if(iterator.hasPrevious()) {
					iterator.previous();
					iterator.remove();
				}
				break;
				
			case 'P':
				char ch = '\0';
				ch = input.charAt(2);
				iterator.add(ch);
				break;
			}
		}
			
		for(char c : list) {
			sb.append(c);
		}
		System.out.println(sb);
	}

}