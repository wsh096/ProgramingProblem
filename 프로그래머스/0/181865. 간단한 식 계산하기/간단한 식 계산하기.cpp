#include <string>
#include <vector>
#include <sstream>

using namespace std;

int solution(string binomial) {
    int a, b;
    char op;
    int answer = 0;
    istringstream iss(binomial);
    iss >> a >> op >> b;
    switch(op){
        case '+':
            answer = a + b;
            break;
        case '-':
            answer = a - b;
            break;
        case '*':
            answer = a * b;
            break;
    }
    return answer;
}