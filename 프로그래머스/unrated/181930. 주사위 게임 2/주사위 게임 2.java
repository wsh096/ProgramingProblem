import java.util.Arrays;
class Solution {
    public long solution(int a, int b, int c) {
        int[] arr = new int[] {a,b,c};
        Arrays.sort(arr);
        
        long sum1 = a + b + c;
        long sum2 = sum1*(a*a + b*b + c*c);
        long sum3 = sum2*(a*a*a + b*b*b + c*c*c);
        
        if(arr[0] == arr[2]){
            return sum3;
        }else if(arr[0]==arr[1]||arr[1]==arr[2]){
            return sum2;
        }
        return sum1;
    }
}