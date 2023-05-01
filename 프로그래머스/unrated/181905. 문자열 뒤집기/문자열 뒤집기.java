//기본적인 StringBuilder의 reverse 방법(이외에도 swap하는 방법이 기본적인 접근)
// class Solution {
//     public String solution(String my_string, int s, int e) {
//         StringBuilder sb1 = new StringBuilder(my_string.substring(0,s));
//         StringBuilder reverse = new StringBuilder(my_string.substring(s,e+1)).reverse();
//         StringBuilder sb2 = new StringBuilder(my_string.substring(e+1));
//         return sb1.append(reverse).append(sb2).toString();
//     }
// }

//한 줄 코딩
class Solution {
public String solution(String my_string, int s, int e) {
    return new StringBuilder(my_string).replace(s, e+1, new StringBuilder(my_string.substring(s, e+1)).reverse().toString()).toString();
}
}
