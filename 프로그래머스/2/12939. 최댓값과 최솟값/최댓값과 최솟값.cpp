#include <string>
#include <vector>
#include <numeric>
#include <sstream>
using namespace std;

string solution(string s) {
    stringstream ss; ss.str(s);
    int temp;
    int i = numeric_limits<int>::max();
    int j = numeric_limits<int>::min();
    while(ss>>temp){
        i = min(temp, i);
        j = max(temp, j);
    }
    return to_string(i) + " " + to_string(j);
}