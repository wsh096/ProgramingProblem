//1. 쓸 때 없이 큰 문자열을 무제한으로 다루는 BigInteger
// 당연히 이게 훨씬 느림.

// import java.math.BigInteger;
// class Solution {
//     public int solution(String number) {
//         return new BigInteger(number).mod(new BigInteger("9")).intValue();
//     }
// }

//2. 각 자리 수의 합을 통해 만든 int를 9로 나눈 나머지(이게 문제의 기본 연습형태.)
// class Solution{
//     public int solution(String number){
//         int answer = 0;
//         for(int i = 0; i < number.length();i++){
//             answer += number.charAt(i)-'0';
//         }
//         return answer%9;
//     }
// }


//3. chars()를 통한 char[] 스트림 사용하기.을 활용해 2번 형태 만들기.

class Solution{
    public int solution(String number){
        return number.chars().map(i->i-'0').sum()%9;
    }
}