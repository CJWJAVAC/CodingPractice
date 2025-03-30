package Silver01;

import java.util.*;

public class KevinBacon {
	
	static int n;
	static int m;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		n = scan.nextInt();
		m = scan.nextInt();
		
		for(int i=0; i<=n; i++) {
			list.add(new ArrayList<>());
		}
		
		for(int i=0; i<m; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			
			list.get(a).add(b);
			list.get(b).add(a);
		}
		
		for(int i=1; i<=n; i++) {
			map.put(i, bfs(list,i));
		}
		
		List<Map.Entry<Integer, Integer>> set = new LinkedList<>(map.entrySet());
		set.sort(Map.Entry.comparingByValue());
		
		int first = set.get(0).getKey();
		System.out.println(first);
	}

	static int bfs(ArrayList<ArrayList<Integer>> list, int start) {
		Queue<Integer> queue = new LinkedList<>();
		boolean[] visited = new boolean[n+1];
		int[] kevin = new int[n+1];
		
		queue.add(start);
		visited[start] = true;
		
		while(!queue.isEmpty()) {
			int current = queue.poll();
			
			for(int next : list.get(current)) {
				if(!visited[next]) {
					queue.add(next);
					visited[next] = true;
					kevin[next] = kevin[current]+1;
				}
			}
		}
		
		int result = 0;
		for(int i=0; i<=n; i++) {
			result+=kevin[i];
		}
		
		return result;
	}
	
}
