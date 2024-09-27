#include <string>
#include <vector>

using namespace std;

int solution(vector<int> diffs, vector<int> times, long long limit) {
    long long answer = 0;
    limit -= times[0];
    long long min = 1;
    long long max = 1;
    for(int i = 1; i < diffs.size(); i++){
        max = max >= diffs[i] ? max : diffs[i];
    }
    while(min < max){
      long long limitCopy = limit;
      long long mid = (min + max) / 2;
      for(int i = 1; i < diffs.size(); i++){
        int doingMore = diffs[i] - mid;
        if(doingMore > 0) {
          limitCopy -= (long long)(times[i] + times[i-1]) * doingMore;
        }
        limitCopy -= times[i];
        if(limitCopy < 0) break;
      }
      if(limitCopy >= 0){
        max = mid;
        answer = mid;
      }else{
        min = mid + 1;
      }
      if(min == max){
        answer = max;
        break;
      }
    }
    return (int)answer;
}