#include <string>
#include <vector>
#include <numeric>
#define a(x)  accumulate((x).begin(), (x).end(), 0)
#define b(x)  accumulate((x).begin(), (x).end(), 1, multiplies<int>())
using namespace std;

int solution(vector<int> num_list) {
    return num_list.size() > 10 ? a(num_list) : b(num_list);
}