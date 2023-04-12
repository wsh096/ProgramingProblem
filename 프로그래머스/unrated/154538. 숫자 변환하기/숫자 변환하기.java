import java.util.Arrays;
class Solution {//dp를 활용해 보자!
    public int solution(int x, int y, int n) {
        if(x==y) return 0;
        int answer = Integer.MAX_VALUE;
        int[] dp = new int[y+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[x] = 0;
        for(int i = x; i < y; i++){
            if(dp[i]!=Integer.MAX_VALUE){//최소값//횟수 증가//인덱스 안 넘게
                if(i+n <= y) dp[i+n] = Math.min(dp[i+n],dp[i]+1);
                if(2*i <= y) dp[2*i] = Math.min(dp[2*i],dp[i]+1);
                if(3*i <= y) dp[3*i] = Math.min(dp[3*i],dp[i]+1);
            }
        }
        return dp[y]==Integer.MAX_VALUE ? -1 : dp[y];
    }
}
        
//         //dfs 시간초과 bf도 시간 초과 예상대로 더 안 됨 dp!.
//         Queue<int[]> bfs = new LinkedList<>();
//        bfs.add(new int[] {x,0});
//         while(!bfs.isEmpty()){
//             int[] value = bfs.poll();
//             int v = value[0];
//             int c = value[1];
//             if(v == y){
//                 answer = c;
//                 break;}
//             if(v < y){
//                 bfs.offer(new int[]{v*2, c+1});
//                 bfs.offer(new int[]{v*3, c+1});
//                 bfs.offer(new int[]{v+n, c+1});
//             }
//         }
//     //    dfs(x,y,n,0);
//         return answer == Integer.MAX_VALUE ? -1 : answer;
//     }
//     //private void dfs(int x, int y, int n, int min){
//       //  if(x>y) return;
//        // if(x==y){
//         //answer =Math.min(min,answer);
//     //return; }
//        // dfs(x*2,y,n,min+1);
//        // dfs(x*3,y,n,min+1);
//        // dfs(x+n,y,n,min+1);
//    // }
// }