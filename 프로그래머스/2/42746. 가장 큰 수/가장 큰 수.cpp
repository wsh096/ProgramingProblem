#include <string>
#include <vector>
#include <algorithm>
#define str(x, y) (to_string(x) + to_string(y))
using namespace std;
bool compare(int a, int b){
    return str(a, b) > str(b, a);
}
string solution(vector<int> numbers) {
    string answer = "";
    sort(numbers.begin(), numbers.end(), compare);
    if(numbers[0] == 0) return "0";
    else{
        for(auto i : numbers){
            answer += to_string(i);
        }
    }
    return answer;
}