/**
1. 문제를 보면 처음 드는 생각. 아, 이게 뭐야 왜 이런 어려운 문제를 Lv0으로 내는 거야...
2. 규칙성을 찾아 보자... 가로/세로 확장하는 거고 결과랑 비교해 보니 k만큼 일단 하나를 반복하고
3. 그 결과를 k만큼 넣어주면 되네.를 생각함.
4. 규칙성을 찾는 거가 시작이고 실제 코드를 짜야 함. char[]을 쓸까? repeat을 쓸까? 여러가지 생각들이 겹침.
5. 위와 같은 상황을 글로 적으면서 정리하고 가장 좋아 보이는 방법을 만듬. 이중 for문을 쓰고 등등...
6. 일단 이 문제가 Lv0 수준에서 끝나려면, 결코 값들이 크면 안 됨. 실제로 20 20 10인 걸로 봐서 최악의 최악으로 봐도 20*20*10 이기 떄문에 연산량이 많지 않음
6. 일반 풀이.
문제 긴 거 보면 사람 다 똑같이 어렵고, 처음 보는 거면 복잡하고 한데,
그걸 쪼개고 의미를 나누고, 구획구획 나눠서 하면서 풀면 또 재밌고 그래서 계속하네요. 다들 화이팅
*/
class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length*k];
        int idx = 0;//인덱스 관리
        int N = picture[0].length();//메서드 지속적인 사용을 회피하기 위한 선택
        
        for(String p : picture){
            
            char[] photo = p.toCharArray();
            StringBuilder sb = new StringBuilder();
            
            for(int i = 0; i < N; i++)//문자 배열의 위치
                for(int j = 0; j < k; j++)//반복회수 sb에 추가
                    sb.append(photo[i]);
                
            String result = sb.toString();
            
            for(int i = 0; i < k; i++)
                answer[idx++] = result;  
        }
        return answer;
    }
}