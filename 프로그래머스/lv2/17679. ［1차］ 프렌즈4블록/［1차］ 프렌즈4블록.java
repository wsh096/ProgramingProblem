import java.util.List;
import java.util.ArrayList;
class Solution {
    public int solution(int m, int n, String[] board) {
        int answer = 0;
        char[][] blocks = new char[m][n];
        //작업과 교체가 편리하게 변환
        for(int i = 0; i < m; i++)
            for(int j = 0; j < n; j++)
            blocks[i][j] = board[i].charAt(j);
    
        //2*2 블록 찾기//삭제//교체의 while
        while(true){
             List<int[]> list = new ArrayList<>();
            //찾기
            for(int i = 0; i < m - 1; i++){
                for(int j = 0; j < n - 1; j++){
                    char c = blocks[i][j];
                    if(c=='-') continue;
                    if(blocks[i+1][j] == c && blocks[i][j+1] == c && blocks[i+1][j+1] == c)//4방위
                    list.add(new int[] {i,j});
                }
            }
            if(list.size()==0) break; //탈출조건 더이상 겹치는 것이 없음
            //삭제
            for(int i =0; i < list.size(); i++){
                int [] block = list.get(i);
                int x = block[0], y = block[1];
                blocks[x][y] = '-';
                blocks[x+1][y] = '-';
                blocks[x][y+1] = '-';
                blocks[x+1][y+1] = '-';
            }
            //교체
            for(int j = 0; j < n; j++){
                int i = m-1;//끝
                while(i>=0){
                    if(blocks[i][j] == '-'){
                        int k = i -1;
                        while(k>=0 &&blocks[k][j]=='-') k--;
                        if(k<0) break;
                        //swap
                        blocks[i][j]=blocks[k][j];//위에서 아래로
                        blocks[k][j]='-';//위에 부분 삭제됐다는 표시
                    }
                    i--;
                }
            }
        }
        //최종 값 확인.
        for(int i = 0; i < m; i++)
            for(int j = 0; j < n; j++)
            if(blocks[i][j]=='-')answer++;
        
        return answer;
    }
}