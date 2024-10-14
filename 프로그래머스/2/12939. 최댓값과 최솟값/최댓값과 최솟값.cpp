#include <string>
#include <sstream>
#include <limits>
using namespace std;

string solution(string s) {

    int _min = numeric_limits<int>::max();
    int _max = numeric_limits<int>::min();
    
    stringstream ss(s);
    int temp;
    while(ss >> temp){
        _min = min(temp, _min);
        _max = max(temp, _max);
    }
    
    return to_string(_min) + " " + to_string(_max);
}