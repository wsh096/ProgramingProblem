class Solution {
    int[] answer = new int[2];
    public int[] solution(int[][] arr) {
     int N = arr.length;
     dfs(arr,0 ,0 , N);
    return answer;
    }
    private void dfs(int[][] arr,int x, int y, int N){
        int standard = arr[x][y];
        if(N<=1){
            answer[standard]++;
            return;
        }
        boolean isSame = true;
 loop:  for(int i = 0; i < N; i++)
            for(int j = 0; j < N; j++){
                if(standard!=arr[x+i][y+j])
                isSame = false;
            if(!isSame) break loop; 
            }
        if(!isSame){
             int newN = N/2;
                    dfs(arr,x,y,newN);
                    dfs(arr,x+newN,y,newN);
                    dfs(arr,x,y+newN,newN);
                    dfs(arr,x+newN,y+newN,newN);
        }else answer[standard]++;
    }
}