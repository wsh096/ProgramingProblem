using System;
using System.Linq;
public class Solution {
    public int[] solution(int[] arr, int k) {
        return (k % 2 == 1) ? arr.Select(s => s * k).ToArray() : arr.Select(s => s + k).ToArray();
    }
}