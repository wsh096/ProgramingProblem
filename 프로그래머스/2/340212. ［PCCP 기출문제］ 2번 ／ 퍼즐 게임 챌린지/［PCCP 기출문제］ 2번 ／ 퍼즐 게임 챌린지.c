#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// diffs_len은 배열 diffs의 길이입니다.
// times_len은 배열 times의 길이입니다.

int solution(int diffs[], size_t diffs_len, int times[], size_t times_len, long long limit) {
    long long answer = 0;
    //적절한 level 찾기. 이진 탐색
    long long min = 1;
    long long max = 1;
    for(int i = 1; i < diffs_len; i++){
        max = (max >= diffs[i]) ? max : diffs[i];
    }
    if(max == 1){
        return 1;
    }
    //첫 번째 데이터는 필요 없음
    limit -= (long long)times[0];
    // 최대 레벨로 해서 찾기.
    while(min < max) {
        long long limitcopy = limit;
        long long mid = (min + max) / 2;
        
        for(int i = 1; i < diffs_len; i++){
            //레벨 기준
            int doingmore = diffs[i] - mid;
            if(doingmore <= 0){
              limitcopy -= times[i];
            }else
            {
              limitcopy -= (long long)(doingmore * (times[i] + times[i - 1]) + times[i]);
            }
            // 해당 기준 값은 값이 부족한 상태, 값을 크게 한다.
            if(limitcopy < 0){
              break;
            }
        }
        //더 낮은 레벨 시도 가능
        if(limitcopy >= 0){
          max = mid;
          answer = mid; // 답의 후보
        }else{
          min = mid + 1;
        }
    }
    if(min == max){
        answer = min;
    }
    return (int)answer;
}