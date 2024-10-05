#include <string>
#include <vector>

using namespace std;

vector<int> solution(vector<int> arr) {
    vector<int> answer;
    int p1 = 0;
    int p2 = arr.size() - 1;
    while(arr[p1] != 2 && p1 < arr.size()){
        p1++;
    }
    while(arr[p2] != 2 && p2 >= 0){
        p2--;
    }
    for(int i = p1; i <= p2; i++) answer.push_back(arr[i]);
    if(answer.empty()) answer.push_back(-1);    
    return answer;
}