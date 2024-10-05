#include <string>
#include <vector>

using namespace std;

int solution(string myString, string pat) {
    int answer = 0;
    size_t found = myString.find(pat);
    while(found != string::npos){
        answer++;
        found = myString.find(pat, found + 1);
    }
    return answer;
}