#include <string>
#include <vector>
#include <stack>
using namespace std;

vector<string> solution(vector<string> quiz) {
    vector<string> answer;
    stack<int> nums;
    stack<char> op;
    for(string str : quiz){
        int i = 0;
        
        while(str[i] != ' ') i++;
        //숫자 get
        nums.push(stoi(str.substr(0, i)));
        //연산자 get
        op.push(str[++i]);
        //i위치를 공백으로 옮겨 주고
        int j = i++;
        // 결과 전까지 찾기
        while(str[j] != '=') j++;
        switch(op.top()){
            case '+':
            nums.push(nums.top() + stoi(str.substr(i, j)));
            break;
            case '-':
            nums.push(nums.top() - stoi(str.substr(i, j)));
            break;
        }
        answer.push_back((stoi(str.substr(++j)) == nums.top()) ? "O" : "X");
        }
    return answer;
}