#include <string>
#include <vector>

using namespace std;

vector<int> solution(vector<int> arr) {
    int len = arr.size();
    int i = 1;
    while(true){
        if(len % i == len || (len % i == 0 && len / i == 1)){
            break;
        }
        i *= 2;
    }
    arr.resize(i);

    return arr;
}