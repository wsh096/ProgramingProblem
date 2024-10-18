#include <string>
#include <vector>
#include <cmath>
using namespace std;

vector<int> solution(int brown, int yellow) {
    vector<int> answer;
    int limit = sqrt(yellow);
    brown -= 4;
    for(int i = 1; i <= limit; i++){
        if(yellow % i == 0){
            int x = yellow / i;
            if(2 * (x + i) == brown){
                answer = {x + 2, i + 2};
                break;
            }
        }
    }
    return answer;
}