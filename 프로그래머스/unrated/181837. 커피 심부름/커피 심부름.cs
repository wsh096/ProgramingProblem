using System;

public class Solution {
    public int solution(string[] order) {
        
        int cnt = 0;
        int size = order.Length;
        for(int i = 0; i < size; i++){
            if(order[i].IndexOf("cafelatte") >= 0) cnt ++;
        }
        return cnt * 5000 + (size - cnt) * 4500;
    }
}