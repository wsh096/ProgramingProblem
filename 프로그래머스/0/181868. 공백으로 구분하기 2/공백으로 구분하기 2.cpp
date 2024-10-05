#include <string>
#include <vector>

using namespace std;

vector<string> solution(string my_string) {
    vector<string> answer;
    bool find_word = false;
    string word = "";
    for(char c : my_string){   
        if(c == ' '){
            if(find_word){
                answer.push_back(word);
                find_word = false;
                word = "";
            }
            continue;
        }else{
            find_word = true;
            word += c;
        }
    }
    if(find_word){
        answer.push_back(word);
    }
    return answer;
}