#include <string>
#include <vector>
#include <numeric>
using namespace std;

int solution(vector<int> num_list) {
    int n = num_list.size();
    int answer = 0;
    if(n <= 10) {
        answer = 1;
        for(int i = 0; i < n; i++){
            answer *= num_list[i];
        }
    }else{
       answer = accumulate(num_list.begin(), num_list.end(), answer);
    }
    return answer;
}