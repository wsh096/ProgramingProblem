#include <string>
#include <vector>
#include <cmath>

using namespace std;

int solution(int a, int b) {
    return (a % 2 == 0 && b %  2 == 0) ? abs(a-b) : (a % 2 == 1 && b % 2 == 1) ? pow(a, 2) + pow(b, 2) : 2 *(a + b);
}