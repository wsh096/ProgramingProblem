#include <string>
#include <vector>

using namespace std;

string solution(string my_string, int m, int c) {
    string answer = "";
    vector<string> strArr;
    for(int i = 0; i < my_string.size(); i += m){
        strArr.push_back(my_string.substr(i, m));
    }
    for(string str : strArr){
        answer += str[c-1];
    }
    return answer;
}