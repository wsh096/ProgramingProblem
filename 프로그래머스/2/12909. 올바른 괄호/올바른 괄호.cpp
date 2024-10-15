#include<string>

using namespace std;

bool solution(string s)
{
    int n = 0;

    for(int i = 0; i < s.size(); i++){
     if(n < 0) return false;
     s[i] == '(' ? n++ : n--;
    }
    return n == 0;
}