#include <vector>

using namespace std;

void dfs(int n, int& answer){
    if(n == 1){
        return;
    }
    dfs(n / 2 , ++answer);
}
int solution(vector<int> num_list) {
    int answer = 0;
    for(int i : num_list){
        dfs(i, answer);
    }
    return answer;
}