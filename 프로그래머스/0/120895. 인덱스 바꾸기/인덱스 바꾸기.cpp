#include <string>
#include <vector>

using namespace std;

string solution(string my_string, int num1, int num2) {
    /* swap은 void 타입이다. string class에 포함되어 있다. */
    swap(my_string[num1], my_string[num2]);
    return my_string;
}