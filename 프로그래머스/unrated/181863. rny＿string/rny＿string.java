//1. 단순 변경 메서드를 적용할 수 있는가.(String의 변환이라 효율성 낮음.)
class Solution {
    public String solution(String rny_string) {
        return rny_string.replaceAll("m","rn");
    }
}
//replaceAll vs. replace
/**
 replace는 문자열에서 주어진 문자열이 일치하는 부분을 모두 치환하는 것이 아니라, 
 주어진 문자열과 정확히 일치하는 부분만 치환
 반면 replaceAll은 정규 표현식에 일치하는 부분을 모두 치환
 즉, 정규표현식 사용 가능 여부가 차이점.
 //개인적으로는 범용성이 큰 replaceAll 사용 추천.
*/