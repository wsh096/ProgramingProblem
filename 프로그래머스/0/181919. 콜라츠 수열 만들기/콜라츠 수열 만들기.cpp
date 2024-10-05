#include <string>
#include <vector>

using namespace std;

void dfs(vector<int>& answer){
    int last = answer.back();
    if(last == 1){
        return;
    }
    last % 2 == 0 ? answer.push_back(last / 2) : answer.push_back(3 * last + 1);
    dfs(answer);
}

vector<int> solution(int n) {
    vector<int> answer;
    answer.push_back(n);
    dfs(answer);
    return answer;
}