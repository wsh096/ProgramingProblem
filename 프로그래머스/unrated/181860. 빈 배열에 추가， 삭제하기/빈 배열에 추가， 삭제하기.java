//1. 일반 풀이
import java.util.List;
import java.util.ArrayList;
class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++){
            if(flag[i])
                for(int j = 0; j < arr[i] * 2; j++)
                    list.add(arr[i]);  
            else
                for(int j = 0; j < arr[i]; j++)
                    list.remove(list.size()-1);
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();//이 정도 스트림은 알아야 마음이 편합니다
    }
}

//2. 스트림 최대화 풀이
// import java.util.List;
// import java.util.ArrayList;
// import java.util.stream.Collectors;
// import java.util.stream.IntStream;
// class Solution {
//         public int[] solution(int[] arr, boolean[] flag) {
//             List<Integer> list = new ArrayList<>();
//             IntStream.range(0, arr.length).forEach(i -> {
//             if (flag[i]) {
//                 list.addAll(IntStream.range(0, arr[i] * 2).mapToObj(j -> arr[i]).collect(Collectors.toList()));
//             } else {
//                 IntStream.range(0, arr[i]).forEach(j -> list.remove(list.size() - 1));
//             }
//         });
//             return list.stream().mapToInt(Integer::intValue).toArray();
//     }
// }