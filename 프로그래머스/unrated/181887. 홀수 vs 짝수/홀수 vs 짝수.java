//1. 일반 풀이 //숏코딩할거면 차라리 이렇게 하시는게 훨씬 좋습니다. 어차피 둘 다 개념은 똑같은데 사용하는 도구가 다른 거라
class Solution {
    public int solution(int[] num_list) {
        int case1 = 0; for(int i = 1; i < num_list.length; i+=2) case1 += num_list[i];
        int case2 = 0; for(int i = 0; i < num_list.length; i+=2) case2 += num_list[i];
        return case1 > case2 ? case1 : case2;
 }
}
//2. 스트림 풀이

// import java.util.stream.IntStream;
// class Solution {
//     public int solution(int[] num_list) {

//         return Math.max(IntStream.range(0,num_list.length).filter(i->i%2==0).map(i->num_list[i]).sum(),IntStream.range(0,num_list.length).filter(i->i%2==1).map(i->num_list[i]).sum());
//     }
// }