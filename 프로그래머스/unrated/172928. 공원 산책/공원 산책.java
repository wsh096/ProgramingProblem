class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = {};
        for(int i = 0; i < park.length; i++){//시작점 찾기.
            if(park[i].contains("S")){
                int j = park[i].indexOf("S");
                answer = new int[] {i,j};
            }
        }
        
loop:   for(int i = 0 ; i < routes.length; i++){
            int record = routes[i].charAt(2)-'0';//1부터 9
            switch(routes[i].charAt(0)){
                case 'N':  //위
                    int tmp = record;
                    while(tmp > 0){
                        if(answer[0]-tmp < 0 || park[answer[0]-tmp].charAt(answer[1])=='X') continue loop;
                        tmp--;//위의 과정들을 다 뚫었다면 값 갱신
                    }
                    answer[0] -= record;
                    break;
                case 'S':  //아
                    tmp = record;
                while(tmp > 0){
                    if(answer[0] + tmp >= park.length || park[answer[0] + tmp].charAt(answer[1])=='X') continue loop;
                    tmp--;//위의 과정들을 다 뚫었다면 값 갱신
                }
                answer[0] += record;
                    break;
                case 'W':  //왼
                    tmp = record;
                while(tmp > 0){
                    if(answer[1]-tmp < 0 || park[answer[0]].charAt(answer[1]-tmp)=='X') continue loop;
                    tmp--;//위의 과정들을 다 뚫었다면 값 갱신
                }
                answer[1] -= record;
                    break;
                case 'E':  //오
                    tmp = record;
                while(tmp > 0){
                    if(answer[1] + tmp >= park[answer[0]].length() || park[answer[0]].charAt(answer[1] + tmp)=='X') continue loop;
                    tmp--;//위의 과정들을 다 뚫었다면 값 갱신
                }
                answer[1] += record;
                    break;
            }           
        }

        return answer;
    }
}