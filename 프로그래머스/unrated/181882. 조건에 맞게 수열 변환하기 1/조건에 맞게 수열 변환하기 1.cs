using System;
using System.Linq;
public class Solution {
    public int[] solution(int[] arr) {
        return arr.Select(i => {
            if(i % 2 == 0 && i >= 50) return i / 2;
            else if(i % 2 == 1 && i < 50) return i * 2;
            else return i;
        }).ToArray();
    }
}