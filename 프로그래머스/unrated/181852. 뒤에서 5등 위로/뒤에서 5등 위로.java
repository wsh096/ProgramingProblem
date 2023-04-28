// import java.util.Arrays;
// class Solution {//low 가독성. 초급적인 문제 풀이. 기본 메서드 활용.
//     public int[] solution(int[] num_list) {
//         int [] answer = new int[num_list.length-5];
//         int idx = 0;
//         Arrays.sort(num_list);// 해당 메서드의 경우 퀵 sort를 통해 NlongN의 시간 복잡도가 평균
//                                 //다만 최악의 경우 N^2에 해당
//         for(int i = 5; i < num_list.length; i++) answer[idx++] = num_list[i];
//         return answer;
//     }
// }

// import java.util.Arrays;
// class Solution{//중급. Arrays도 알고, copyOfRange라는 메서드도 찾아보며 문제를 학습.
//     public int[] solution(int[] num_list){
//         Arrays.sort(num_list);
//         return Arrays.copyOfRange(num_list,5,num_list.length);//해당 메서드 시간 복잡도 O(N)
//     }
// }


//Arrays 객체를 활용해 stream 을 활용할 거고 대상은 num_list라는 int[] 배열이야.
//해당 값을 .boxed()를 통해 int 기본 타입을 -> Integer wrappertype(래퍼 타입)으로 변환해
//그래야 .sorted() 메서드가 작동하기 때문이지. (스트림은 객체를 활용한 연산이어서 그러함)
//그리고 .skip(5) 봐도 딱 감 오겠지만 5개 뛰어 넘는 중간 연산자 :) 
//이제 우리가 반환할 배열을 만들기 위해 .mapToInt()를 활용
//여기서 사용된 방법 역시 '람다 표현식' 중 하나. 
// :: 는 '메서드 참조'를 나타내는 방법 'Integer값.intValue();'가 추상화 된 것으로 ()도 생략 되는 형태
//마지막으로 .toArray();를 통한 최종연산으로 stream을 끝내 주고 결과를 반환.

import java.util.Arrays;
class Solution{//상급 가독성 high 성능 low(스트림 때문 아래 코드 설명 위 첨부)
    public int[] solution(int[] num_list){
       return Arrays.stream(num_list).boxed().sorted().skip(5).mapToInt(Integer::intValue).toArray();
    }
}