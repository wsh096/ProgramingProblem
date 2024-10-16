#include<string>

using namespace std;

bool solution(string s)
{
    int n = 0;
    for(char c : s){
        if(n < 0) break;
        (c == '(') ? n++ : n--;
    }
    return n == 0;
}