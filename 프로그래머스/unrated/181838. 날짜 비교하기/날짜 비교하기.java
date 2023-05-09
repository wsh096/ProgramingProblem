//1. 단순 풀이
// class Solution {
//     public int solution(int[] date1, int[] date2) {
//         StringBuilder day1 = new StringBuilder();
//         StringBuilder honne = new StringBuilder();
//         for(int i = 0; i < date1.length; i++){
//             day1.append(date1[i]);
//             honne.append(date2[i]);
//         }
//         return Integer.parseInt(day1.toString()) < Integer.parseInt(honne.toString()) ? 1 : 0;
//     }
// }

//2. LocalDate 타입 //단순 풀이 보다 느리네... 역시 기본이 제일 빠르다...
// import java.time.LocalDate;
// class Solution {
//     public int solution(int[] date1, int[] date2) {
//         LocalDate d1 = LocalDate.of(date1[0],date1[1],date1[2]);
//         LocalDate d2 = LocalDate.of(date2[0],date2[1],date2[2]);
//                 return d1.isBefore(d2) ? 1 : 0;
//     }
// }

//3. 간단 풀이 및 최적화
import java.util.Arrays;
class Solution {
    public int solution(int[] date1, int[] date2) {
                return Arrays.compare(date1,date2) < 0 ? 1:0;
    }
}