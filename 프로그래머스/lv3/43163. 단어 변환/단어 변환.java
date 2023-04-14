import java.util.*;
class Solution {
    public int solution(String begin, String target, String[] words) {
      boolean hasTarget = false;
        for(String word : words)
            if(word.equals(target)){
                hasTarget = true;
                break;
            }
        if(!hasTarget) return 0;
        Queue<String> queue = new LinkedList<>();
        boolean[] visited = new boolean[words.length];
        
        queue.offer(begin);
        int level = 0;
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0; i < size; i++){
                String curr = queue.poll();
                if(curr.equals(target)) return level;
                for(int j = 0; j < words.length; j++)
                    if(!visited[j] && canChange(curr, words[j])){
                        visited[j] = true;
                        queue.offer(words[j]);
                    }
            }
            level++;
        }
        return 0;
    }
    private boolean canChange(String s1, String s2){
        int cnt = 0;
        for(int i = 0; i < s1.length(); i++)
        if(s1.charAt(i) != s2.charAt(i)) cnt++;               
        return cnt == 1;
    }
}