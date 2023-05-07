//1.일반 풀이 정규표현식. \\s는 공백에 관한 정규식+는 공백 한 개 이상인 경우라는 의미 이를 공백 하나로 바꾸라는 의미.
class Solution {
    public String[] solution(String my_string) {
        return my_string.trim().replaceAll("\\s+"," ").split(" ");
    }
}