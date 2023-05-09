//1. 일반 풀이 + 정규식. 매우 짧지만 스트링을 바꾸는 거여서 굉장히 느림.
// class Solution {
//     public String solution(String myString) {
//         return myString.replaceAll("[a-k]","l");
//     }
// }

//2. 고도화 역시 느리지만 스트림 한 줄 풀이 가능
// import java.util.stream.Collectors;
// class Solution {
//     public String solution(String myString) {
//         return myString.chars().mapToObj(ch -> ch < 'l' ? "l" : String.valueOf((char) ch)).collect(Collectors.joining());
//     }
// }

//3. 속도 중심 풀이
class Solution {
    public String solution(String myString) {
        char[] chArr = myString.toCharArray(); 
        for(int i = 0; i < chArr.length; i++) 
            if(chArr[i] < 'l') 
                chArr[i] = 'l'; 
        return new String(chArr);
    }
}