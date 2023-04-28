
// class Solution {//최고 성능 가독성 low(괄호 정리하면 중상급 가독성 가능 숏코드를 위한 가독성 파괴.)
//     public String solution(String[] str_list, String ex) {
//         StringBuilder answer = new StringBuilder();
//         for(String s : str_list) if(!s.contains(ex)) answer.append(s);
//         return answer.toString();
//     }
// }


 
    //배열을 스트림으로 작성할 거야. 스트림에 쓰일 배열은 str_list고 
    //이걸 필터를 활용해서 걸러낼게. 
    //여기서 걸러지는 건 s라고 할게 str_list에 담겨 있는 값이 String이니까 s는 String이라고 
    //Java 컴파일러는 유추를 할거야. 람다식이고 (*람다식은 Java8에서부터 지원했고, 추상화를 특징으로 함.) 
    //그럼 s는 문자열이니까, 문자열에 해당하는 메서드 중 하나인 contains를 활용해 걸러낼게.
    //!s.contains(ex)니까 ex가 포함되어 있지 않은 문자열을 filter는 걸러낼 거야.
    //자 이제 이걸 모으자(collect) collect연산식을 활용해서.
    //Collectors.joining()을 활용하면 최종 연산으로 문자열을 합쳐주는 역할을 수행한 결과값을 반환해줘
import java.util.Arrays;
import java.util.stream.Collectors;
class Solution {//낮은 성능 high 가독성.(이유 포함 위에 내용 참고)

    public String solution(String[] str_list, String ex) {
        return Arrays.stream(str_list).filter(s->!s.contains(ex)).collect(Collectors.joining());
    }
}