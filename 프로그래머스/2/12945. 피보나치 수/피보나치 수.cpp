#include <string>
#include <vector>

using namespace std;
int dp[100001];
int fibonachi(int n){
    if(n <= 1){
        return n;
    }
    if(dp[n] != 0){
        return dp[n];
    }else{
        dp[n] = (fibonachi(n - 2) + fibonachi(n - 1))%1234567;
    }
    return dp[n];
}
int solution(int n) {
    
    return fibonachi(n);
}