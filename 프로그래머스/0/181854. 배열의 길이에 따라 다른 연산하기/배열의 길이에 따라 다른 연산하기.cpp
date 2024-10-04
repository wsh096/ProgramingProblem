#include <string>
#include <vector>

using namespace std;

vector<int> solution(vector<int> arr, int n) {
    bool order = arr.size() % 2 == 0;
    int i = order ? 1 : 0;
    while(i < arr.size()){
        arr[i] += n;
        i += 2;
}
    return arr;
}