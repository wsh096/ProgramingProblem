#include <string>
#include <vector>
#include <algorithm>
using namespace std;

string solution(string my_string, int s, int e) {

    string front = my_string.substr(0, s);
    string reversetarget = my_string.substr(s, e + 1  - s);
    string end = my_string.substr(e + 1);
    reverse(reversetarget.begin(), reversetarget.end());

    return front + reversetarget + end;
}