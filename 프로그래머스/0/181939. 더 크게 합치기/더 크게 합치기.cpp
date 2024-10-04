#include <string>
#include <vector>
#define doing(x, y) stoi(to_string(x) + to_string(y))
using namespace std;

int solution(int a, int b) {
    return max(doing(a, b), doing(b, a));
}