#include <string>
#include <vector>

using namespace std;

vector<int> solution(vector<int> arr) {
    int len = arr.size();
    int i = 1;
    while(i < len){
        i *= 2;
    }
    arr.resize(i);

    return arr;
}