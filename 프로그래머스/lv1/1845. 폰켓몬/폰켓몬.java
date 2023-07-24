import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        
        int n = nums.length;
        HashSet<Integer> hs = new HashSet<>();
        for(int i : nums)
            hs.add(i);
        
        int h = hs.size();
        
        if(n/2 < h){
            return n/2;
        }else
            return h;
        
    }
}

// import java.util.*;
// import java.util.stream.*;
// class Solution {
//     public int solution(int[] nums) {
//         // 내가 가질 수 있는 폰켓몬 수
//         int answer = nums.length / 2;
//         // HashSet객체 생성
//         HashSet hashset = new HashSet();
//         // 제한 조건 1이상 10,000이하의 수 이고, 항상 짝수이어야한다.
//         if((1 <= nums.length && nums.length <= 10000) && nums.length % 2 == 0) {
//             // 제한 조건 확인 및 HashSet에 nums 데이터 추가 - HashSet은 중복x
//             for(int item: nums) {
//                 if(1 <= item && item <= 200000) {
//                     hashset.add(item);
//                 }
//             }
//             // 내가 가질 수 있는 폰켓몬 수 보다 폰켓몬이 작을때
//             if(answer > hashset.size()) {
//                 answer = hashset.size();
//             }
//         }
//         return answer;
//     }
// }