import java.util.Arrays;

class Solution {
    public int solution(int n, int[][] costs) {
        int answer = 0;
        Arrays.sort(costs, (a, b) -> a[2] - b[2]); 
        int[] parent = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i; // 초기화
        }
        for (int i = 0; i < costs.length; i++) {
            int start = findParent(parent, costs[i][0]);
            int end = findParent(parent, costs[i][1]);
            if (start != end) { // 사이클이 아니면
                parent[end] = start; // 합침
                answer += costs[i][2];
            }
        }
        return answer;
    }
    
    private int findParent(int[] parent, int x) {
        if (parent[x] != x) {
            parent[x] = findParent(parent, parent[x]);
        }
        return parent[x];
    }
}