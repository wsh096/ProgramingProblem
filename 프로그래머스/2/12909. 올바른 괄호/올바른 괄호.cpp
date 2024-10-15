#include<string>
#include <stack>

using namespace std;

bool solution(string s)
{
    stack<char> _s;
    _s.push(s[0]);
    for(int i = 1; i < s.size(); i++){
     if(!_s.empty() && _s.top() == '(' && s[i] == ')') _s.pop();
     else _s.push(s[i]);
    }
    if(!_s.empty()) return false;
    return true;
}