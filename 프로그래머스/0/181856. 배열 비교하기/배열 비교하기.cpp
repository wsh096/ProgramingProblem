#include <string>
#include <vector>
#include <numeric>
using namespace std;

int solution(vector<int> arr1, vector<int> arr2) {
    int answer = 0;
    int arr1_length = arr1.size();
    int arr2_length = arr2.size();
    if(arr1_length != arr2_length){
        return arr1_length > arr2_length ? 1 : -1;
    }else{
        int arr1_sum = accumulate(arr1.begin(), arr1.end(), 0);
        int arr2_sum = accumulate(arr2.begin(), arr2.end(), 0);
        if(arr1_sum != arr2_sum){
            return arr1_sum > arr2_sum ? 1 : -1;
        }else{
            return 0;
        }
    }
    return answer;
}