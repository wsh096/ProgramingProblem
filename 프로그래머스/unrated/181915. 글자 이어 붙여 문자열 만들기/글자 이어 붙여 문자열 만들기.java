//1. String을 써도 되지만 그런 성능 낮은 것 보다 StringBuilder의 활용이 더 좋음. 
//맵 같은 형태로 index가 들어 있기 때문에. 해당 정보를 활용해 해결한 로직.

// class Solution {
//     public String solution(String my_string, int[] index_list) {
//        StringBuilder answer = new StringBuilder();
//         for(int i : index_list){
//             answer.append(my_string.charAt(i));
//         }
//         return answer.toString();
//     }
// }

//2. Stream의 활용
// import java.util.stream.IntStream;
// import java.util.stream.Collectors;
// class Solution{
//     public String solution(String str, int[] idx){
//         return IntStream.of(idx).mapToObj(str::charAt).map(Object::toString).collect(Collectors.joining());
//     }
// }

//3. 다르게 작성하기
// StringBuilder의 활용
import java.util.Arrays;
class Solution{
    public String solution(String str, int[] idx){
        return Arrays.stream(idx)
                .mapToObj(str::charAt)
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append) //StringBuilder가 만들어지고, StringBuilder에 저장. 결과값 StringBuilder에 저장.
                .toString();
    }
}