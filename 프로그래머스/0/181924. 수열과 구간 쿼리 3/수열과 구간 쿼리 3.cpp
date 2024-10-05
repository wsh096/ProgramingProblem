#include <string>
#include <vector>

using namespace std;

vector<int> solution(vector<int> arr, vector<vector<int>> queries) {
    for(vector<int> q : queries){
        int p1 = q[0];
        int p2 = q[1];
            swap(arr[p1], arr[p2]);
    }
    return arr;
}