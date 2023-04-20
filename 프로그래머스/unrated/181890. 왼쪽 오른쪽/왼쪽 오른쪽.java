
class Solution {
    public String[] solution(String[] str_list) {
        int lIdx = -1;
        for(int i = 0; i < str_list.length; i++)
            if(str_list[i].equals("l")) {lIdx = i; break;}
        int rIdx = -1;
         for(int i = 0; i < str_list.length; i++)
            if(str_list[i].equals("r")) {rIdx = i; break;}
        int idx = 0;
        boolean direction = true;//true 면 왼쪽 //false면 오른쪽
        if(lIdx == -1 && rIdx == -1) return new String[] {};  
        else if(rIdx == -1) {idx = lIdx;}
        else if(lIdx == -1) {idx = rIdx; direction = false;}
        else {
            if(lIdx < rIdx)
                idx = lIdx;
            else{
                idx = rIdx;
                direction = false;
            }
        }
        
       if((idx == 0 && direction) || (idx == str_list.length-1 && !direction))
        return new String[] {};
                             
       String[] answer = {};
          int index = 0;
        if(direction){//왼쪽
            answer = new String[idx];
             for(int i = 0; i < idx; i++){
                answer[index++] = str_list[i];
            }
        }else{//오른쪽
            answer = new String[str_list.length-1-idx];
            for(int i = idx+1; i < str_list.length; i++){
                answer[index++] = str_list[i];
            }
        }
            
        return answer;
    }
}