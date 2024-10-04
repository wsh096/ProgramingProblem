#include <string>
#include <vector>

using namespace std;

vector<int> solution(vector<int> arr, int k) {

        for(int i = 0; i < arr.size(); i++){
           k % 2 == 1 ?  arr[i] *= k : arr[i] += k;
        }
  
    return arr;
}