#include <string>
#include <vector>

using namespace std;

string solution(string my_string, vector<int> indices) {
    string answer = "";
    for(int i = 0; i < indices.size(); i++){
        my_string[indices[i]] = ' ';
    }
    for(char c : my_string){
        if(c == ' ') continue;
        answer += c;
    }
    return answer;
}