#include <string>
#include <vector>

using namespace std;

string solution(string rny_string) {
    int i = 0;
    while(rny_string[i] != '\0'){
        if(rny_string[i] == 'm'){
        //뒤를 먼저 기록
        string back = rny_string.substr(i + 1);
        string front = rny_string.substr(0, i) += "rn";
        rny_string = front + back;
        }
        i++;
    }
    return rny_string;
}