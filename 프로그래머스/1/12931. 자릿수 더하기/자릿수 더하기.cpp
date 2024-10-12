#include <iostream>

using namespace std;
int solution(int n)
{
    int answer = 0;

string temp = to_string(n);
    for(char c : temp){
        answer += c - '0';
    }
    return answer;
}