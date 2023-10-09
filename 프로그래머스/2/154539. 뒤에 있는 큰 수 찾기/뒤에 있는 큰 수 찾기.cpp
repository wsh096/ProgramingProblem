#include <vector>
#include <stack>

using namespace std;

vector<int> solution(vector<int> numbers) {
    int n = numbers.size();
    vector<int> answer(n, -1);
    stack<int> stack;

    for (int i = n - 1; i >= 0; i--) {
        while (!stack.empty() && numbers[i] >= numbers[stack.top()]) {
            stack.pop();
        }
        if (!stack.empty()) {
            answer[i] = numbers[stack.top()];
        }
        stack.push(i);
    }

    return answer;
}
