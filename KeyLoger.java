package Silver02;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class KeyLoger {
	
	static StringBuilder sb;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		sb = new StringBuilder();
		LinkedList<Character> list = new LinkedList<>();
		ListIterator<Character> it = list.listIterator();
		
		int n = scan.nextInt();
		
		for(int i=0; i<n; i++) {
			String str = scan.next();
			keyloger(list,it,str);
		}
		
		System.out.println(sb);
	}

	static void keyloger(LinkedList<Character> current, ListIterator<Character> it, String str) {
		current.clear();
		it = current.listIterator();
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			
			switch(ch) {
			case '<':
				if(it.hasPrevious()) {
					it.previous();
				}
				break;
				
			case '>':
				if(it.hasNext()) {
					it.next();
				}
				break;
				
			case '-':
				if(it.hasPrevious()) {
					it.previous();
					it.remove();
				}
				break;
				
			default:
				it.add(ch);
				break;
			}
		}
		
		for(char c : current) {
			sb.append(c);
		}
		sb.append("\n");
	}
	
}
