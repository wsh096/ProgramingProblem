class Solution {
    public int solution(int[] num) {
        StringBuilder odd = new StringBuilder();
        StringBuilder even = new StringBuilder();
       for(int i : num)
           if(i % 2 == 0) even.append(i);
           else odd.append(i);
      
        return Integer.parseInt(odd.toString()) + Integer.parseInt(even.toString());
    }
}