#include <string>
#include <vector>

using namespace std;

string solution(vector<string> str_list, string ex) {
    string answer = "";
    for(string str : str_list){
        //찾는 게 없으면 추가 //있으면 패스
        (str.find(ex) == string::npos) ? answer += str : answer;
    }
    return answer;
}