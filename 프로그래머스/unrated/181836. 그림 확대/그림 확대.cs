using System;
using System.Collections.Generic;

public class Solution {
    public string[] solution(string[] picture, int k) {
        List<string> answer = new List<string>();
        string replace_a = "";
        string replace_b = "";
        for(int i = 0; i < k; i++)
        {
            replace_a += ".";
            replace_b += "x";
        }
        for(int i = 0; i < picture.Length; i++)
        {
            picture[i] = picture[i].Replace(".", replace_a);
            picture[i] = picture[i].Replace("x",replace_b);
            
            for(int j = 0; j < k; j++)
            {
                answer.Add(picture[i]);
            }
        }
        return answer.ToArray();
    }
}