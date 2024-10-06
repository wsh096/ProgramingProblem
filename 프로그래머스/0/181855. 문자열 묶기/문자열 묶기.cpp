#include <string>
#include <vector>

using namespace std;

int solution(vector<string> strArr) {
int dp[31] = {0,};
    int answer = 0;
    for(auto str : strArr){
        dp[str.size()]++;
    }
    for(int i = 0; i < sizeof(dp)/sizeof(int); i++){
        answer = max(answer, dp[i]);
    }

    return answer;
}