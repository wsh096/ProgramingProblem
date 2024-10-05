#include <string>
#include <vector>

using namespace std;

int solution(string myString, string pat) {
    if(pat.size() > myString.size()) return 0;
    for(char& c : myString){
        c = tolower(c);
    }
    for(char& c : pat){
        c = tolower(c);
    }
    return myString.find(pat) != string::npos;
}