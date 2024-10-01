#include <iostream>
#include <vector>
using namespace std;
int N;
vector<char> input;
int result = -100001;

void solve(int i, int sum);
int op(int i, int j, char op);

int main(void){
   cin >> N;
    for(int i = 0; i < N; i++){
        char c;
        cin >> c;
        input.push_back(c);
   }
   solve(2, input[0] - '0');
   cout << result;
   return 0;
}
void solve(int i, int sum){
    if(i >= N){
        result = max(result, sum);
    return;
    }
    solve(i + 2, op(sum, input[i] - '0', input[i - 1]));
    if(i + 2 < N){
        int right = op(input[i] - '0', input[i + 2] - '0', input[i + 1]);
        int left = op(sum, right, input[i - 1]);
        solve(i + 4, left);
    }
}
int op(int i, int j, char op){
    if(op == '+')
        return i + j;
    else if(op == '-')
        return i - j;
    else
        return i * j;
}
          