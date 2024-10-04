#include <string>
#include <vector>
#include <utility>
using namespace std;

int solution(int n, string control) {
    vector<pair<char, int>> changes = {{'w', 1}, {'s', -1}, {'d', 10}, {'a', -10}};
    for(char c : control){
        for(auto change : changes){
            if(change.first == c){
                n += change.second;
                break;
            }
        }
    }
    return n;
}