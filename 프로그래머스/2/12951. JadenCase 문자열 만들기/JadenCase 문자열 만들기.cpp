#include <string>

using namespace std;

string solution(string s) {
    for(int i = 0; i < s.size(); i++){
        char& c = s[i];
        if(i == 0 || (i > 0 && s[i-1] == ' ')){
            c = toupper(c);
        }else{
            c = tolower(c);
        }
    }
    return s;
}