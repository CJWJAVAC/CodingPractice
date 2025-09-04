package Silver02;

import java.util.*;

public class N_and_M_9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] num = new int[n];
        
        for (int i = 0; i < n; i++) {
            num[i] = scan.nextInt();
        }
        
        Arrays.sort(num); // 입력된 수를 정렬
        
        StringBuilder sb = new StringBuilder();
        boolean[] visited = new boolean[n];
        
        backtrack(num, new ArrayList<>(), visited, m, sb);
        
        System.out.print(sb.toString());
    }

    static void backtrack(int[] num, List<Integer> current, boolean[] visited, int m, StringBuilder sb) {
        if (current.size() == m) {
            for (int i = 0; i < current.size(); i++) {
                sb.append(current.get(i)).append(" ");
            }
            sb.append("\n");
            return;
        }
        
        for (int i = 0; i < num.length; i++) {
            if (i > 0 && num[i] == num[i - 1] && !visited[i - 1]) {
                continue; // 중복된 수열을 방지하기 위해 이전 수와 같은 수는 건너뜀
            }
            if (!visited[i]) {
                visited[i] = true;
                current.add(num[i]);
                backtrack(num, current, visited, m, sb);
                current.remove(current.size() - 1);
                visited[i] = false;
            }
        }
    }
}
