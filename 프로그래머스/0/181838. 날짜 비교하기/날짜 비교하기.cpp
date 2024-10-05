#include <string>
#include <vector>

using namespace std;

int solution(vector<int> date1, vector<int> date2) {
    int num1 = 0;
    int num2 = 0;
    vector<int> nums = {12, 30, 1};
    for(int i = 0; i < date1.size(); i++){
        num1 += nums[i]*date1[i];
        num2 += nums[i]*date2[i];
    }
    return num1 < num2;
}