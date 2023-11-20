import java.util.Queue;
import java.util.LinkedList;
import java.util.Arrays;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        if(truck_weights.length == 1){return bridge_length + 1;}//테케 14번만 해당하는 케이스
        if(Arrays.stream(truck_weights).sum() <= weight //테케 3번 통과하는 케이스
             && truck_weights.length <= bridge_length) {return truck_weights.length + bridge_length;}
        
        int answer = 0;
        Queue<Integer> q = new LinkedList<>();
        
        int sum = 0;
        for(int i:truck_weights){
            while(true){
                
                
                if(q.isEmpty()){
                    q.offer(i);
                    answer++;
                    sum = i;
                    break;
                }
                if(q.size() == bridge_length){
                    sum -= q.poll();
                }
                    
                if(sum + i <= weight){
                    q.offer(i);
                    answer++;
                    sum += i;
                    break;
                }else if(sum + i > weight){
                    q.offer(0);
                    answer++;
                }
            }
            
        }    
        return answer + bridge_length;
    }
}



// import java.util.Queue;
// import java.util.LinkedList;
// import java.util.Arrays;

// class Solution {
//     public int solution(int bridge_length, int weight, int[] truck_weights) {
//         int answer = 0;
        
//         //         //(예제 2의 특징)길이가 하나여서 처리해줘야 하는 값이 하나로 이 경우에는 올라가서 나오는데 걸리는 시간이 다리 길이 + 1;//마지막으로 남은 하나의 정보는 다 이럼.
//        if(truck_weights.length == 1){return bridge_length + 1;}//테케 14번만 해당하는 케이스
        
// //         //(예제 3의 특징) 전체 무게의 합이 제한 하중 이하이고, 길이 역시 bridge_length에 걸리지 않는 경우
// //         //이건 모두 묶인 경우.
//         if(Arrays.stream(truck_weights).sum() <= weight //테케 3번 통과하는 케이스
//             && truck_weights.length <= bridge_length) {return truck_weights.length + bridge_length;}
        
//         int limit = 0;
//         Queue<Integer> q = new LinkedList<>();
//         for(int i : truck_weights){
//             while(true){
//                 if(q.isEmpty()){
//                     limit = i;
//                     q.offer(i);
//                     answer++;
//                     break;
            
//                 }else if(q.size()==bridge_length){//안 비었다면.
//                     limit -= q.poll();
//                     break;
//                     }
//                  else{
//                      if((limit += i) > weight){
//                          q.offer(0);
//                          answer++;
//                          break;
//                      }else{
//                          q.offer(i);
//                          limit += i;
//                          answer++;
//                          break;
//                      }
//                  }   
//             }
//         }
     
        
//         return answer;
//     }
// }


// import java.util.Queue;
// import java.util.LinkedList;
// //import java.util.Stack;
// import java.util.Arrays;


// class Solution {
//     public int solution(int bridge_length, int weight, int[] truck_weights) {
//        //묶음이 발생하는가 하지 않는가.
        
//         int 길이 = truck.length; 
//         int answer = 길이 * bridge_length + 1;//가능한 최대값.
//         //(예제 2의 특징)길이가 하나여서 처리해줘야 하는 값이 하나로 이 경우에는 올라가서 나오는데 걸리는 시간이 다리 길이 + 1;//마지막으로 남은 하나의 정보는 다 이럼.
//         if(길이 == 1){return answer}//테케 14번만 해당하는 케이스
        
//         //(예제 3의 특징) 전체 무게의 합이 제한 하중 이하이고, 길이 역시 bridge_length에 걸리지 않는 경우
//         //이건 모두 묶인 경우.
//         if(Arrays.stream(truck_weights).sum() <= weight //테케 3번 통과하는 케이스
//            && 길이 <= bridge_length) {return 길이 + bridge_length;}
        
//         //묶음이 발생하는가 발생하지 않는가.
//         //answer
        
        
//         return answer;
//     }
// }


























//42.9점 풀이
//import java.util.Queue;
// import java.util.LinkedList;

// class Info{
//     int weight;
//     int time;
    
//     public Info(int weight, int time){
//         this.weight = weight;
//         this.time = time;
//     }
// }

// class Solution {
//     public int solution(int bridge_length, int weight, int[] truck_weights) {
//         int answer = 0;
        
//         Queue<Info> trucks = new LinkedList<>();
//         Queue<Info> bridge = new LinkedList<>();
//         for(int i : truck_weights){
//             trucks.offer(new Info(i,0));
//         }
//         while(!trucks.isEmpty()){//truck 대기열이 빌 때까지 일해라.
            
//             int weightlimit = 0; //최대 무게 확인처.
//             int cnt = bridge_length;//최대 대수 확인처
            
//             //while까지가 초기 세팅.
//             if(bridge.isEmpty() && trucks.size() == 1){//원소가 하나 남았을 때의 처리.
//                 return answer += bridge_length + 1;
//             }
            
//             if(bridge.isEmpty()){//시작단계
//                 Info 첫변수 = trucks.poll();
//                 bridge.offer(new Info(첫변수.weight,첫변수.time + 1));
//                 answer++;
//                 weightlimit = 첫변수.weight;
//                 cnt--;    
//             }
            
//             //묶음화 가능성 판단 while
            
//             //trucks가 비어있으면 nullpointexception이 발생합니다.
//             while(!trucks.isEmpty() && (weightlimit + trucks.peek().weight <= weight) && cnt != 0){//clustering 묶음화
//                 //무게가 제한선에 안 걸리고, 길이가 여유가 있다면, 묶음화 해 준다.
//                 Info 둘변수 = trucks.poll();
// loop:           for(int i = 0; i < bridge.size(); i++){
//                     Info 삼변수 = bridge.poll();
//                     if(삼변수.time == bridge_length){
//                         //이때 무게도 줄여줘야 합니다.
//                         weightlimit -= 삼변수.weight;
//                         continue loop;//해당 변수는 더 취급할 필요가 없기에 제거해 줍니다.
//                     }
//                     //해당 변수는 시간을 하나 더 하고 전체를 다 더 해야 하는 상태입니다.
//                     bridge.offer(new Info(삼변수.weight, 삼변수.time + 1));
//                 }
                
//                 bridge.offer(new Info(둘변수.weight, 둘변수.time + 1));
//                 answer++;
//                 weightlimit += 둘변수.weight;
//                 cnt--;
//             } 
            
//             //제거해 주는 루틴을 작성을 안 했네요. ...ㅎ
//             //최대한 심플하면 좋겠네
            
//             //위의 상황들로 인해 가득차거나 이미 종료가 된 상황.
            
//             //제거 루틴
//             if(bridge.size() == 1){//묶음화가 진행되지 않은 경우로 이 녀석만 제거하면 됩니다.
//                 //제거의 기준은 남은 cnt의 수.
//                 Info 사변수 = bridge.poll();
//                 answer += bridge_length - 사변수.time;//하나라도 아래의 상황에서 exit하면 다시 하나가 될 수 있기 때문.
//             }else{ //bridge.size() > 2 이상인 묶음화가 진행된 경우
//                 if(trucks.isEmpty()){//묶음화 상황에서 trucks가 비어있다면 맨 마지막 값의 time에 bridge_length를 더해주면 됩니다.
//                     //deque가 더 좋았겠네요.
//                     while(bridge.size() != 1){
//                         bridge.poll();
//                     }
//                     return answer += bridge_length;//이게 답이 됩니다.
//                 }
//                 else{//trucks가 비어있지 않다면, 클러스터링의 값이 바뀔 때까지 최신화 해줘야 합니다.
                    
//                     while( (weightlimit + trucks.peek().weight) > weight && !bridge.isEmpty() ){
//                         //weightlimit으로 묶음화 단위를 관리해 줍니다.//weightlimit이 적어지거나(묶음화 가능성이 생기거나)
//                         //bridge를 비울 때 까지 반복합니다.
//                         if(bridge.peek().time == bridge_length){ //시간이 나가야 할 시간이라는 뜻이 되겠네요.
//                             weightlimit -= bridge.poll().weight;//다시 들어올 필요가 없습니다.
//                         }else{//하지만 그렇지 않다면 해당 시간 조건이 될때까지 사이즈만큼 반복하며 시간을 올려줍니다.
//                             for(int i = 0; i < bridge.size(); i++){
//                                 Info 오변수 = bridge.poll();//사이즈 만큼 반복하며 크기를 키웁니다.
//                                 bridge.offer(new Info(오변수.weight, 오변수.time + 1));
//                             }
//                             answer++;
//                         }
//                     }//이제 가능성이 생겼습니다. while전체를 종료해 보고 또 다른 새로운 가능성을 만나러 가 보죠.
//                 }
//            }         
//         }
            
   
//         return answer;
//     }
// }