#include <string>
#include <vector>

using namespace std;

string solution(string myString, string pat) {
    string answer = "";
    size_t found = myString.find(pat, 0);
    size_t found_idx = string::npos;
    while(found != string::npos){
        found_idx = found;
        found = myString.find(pat, found + 1);
    }
    if(found_idx == string::npos){return 0;}
    
    return myString.substr(0, found_idx + pat.size());
}