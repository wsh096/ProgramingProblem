#include <string>
#include <vector>

using namespace std;

int solution(vector<int> num_list) {
    string odd = "";
    string even = "";
    for(int i : num_list){
        i % 2 == 0 ? even += to_string(i) : odd += to_string(i);
    }
    return stoi(odd) + stoi(even);
}