#include <string>
#include <vector>

using namespace std;

string solution(string myString) {
    for(int i = 0; i < myString[i] != '\0'; i++){
        if(myString[i] == ' ') continue;
        myString[i] = tolower(myString[i]);
        if(myString[i] == 'a'){
            myString[i] = 'A';
        }
    }
    return myString;
}