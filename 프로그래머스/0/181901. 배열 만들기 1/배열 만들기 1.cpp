#include <string>
#include <vector>

using namespace std;

vector<int> solution(int n, int k) {
    vector<int> answer;
    int copyk = k;
    while(k <= n){
        answer.push_back(k);
        k+=copyk;
    }
    return answer;
}