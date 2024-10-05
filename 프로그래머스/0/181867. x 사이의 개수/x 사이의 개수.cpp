#include <string>
#include <vector>

using namespace std;

vector<int> solution(string myString) {
    vector<int> answer;
    int cnt = 0;
    int i = 0;
    while(myString[i] != '\0'){
        if(myString[i] == 'x'){
            answer.push_back(cnt);
            cnt = 0;
            while(myString[i] != 'x'){
                i++;
            }
        }else{
            cnt++;
        }
        i++;
        if(myString[i] == '\0'){
                answer.push_back(cnt);
                cnt = 0;
        }
    }

    return answer;
}