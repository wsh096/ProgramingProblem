using System;

public class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.Length - n + 1];
        int idx = 0;
        for(int i = n - 1; i < num_list.Length; i++){
            answer[idx++] = num_list[i];
        }
        return answer;
    }
}