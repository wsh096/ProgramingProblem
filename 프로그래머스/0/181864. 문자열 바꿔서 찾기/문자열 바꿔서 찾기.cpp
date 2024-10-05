#include <string>
#include <vector>

using namespace std;

int solution(string myString, string pat) {
    string pat_target = "";
    for(char c : pat){
        pat_target += (c == 'A' ?  'B' : 'A');
    }
    return myString.find(pat_target) == string::npos ? 0 : 1;
}