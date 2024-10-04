#include <string>
#include <vector>

using namespace std;

vector<int> solution(vector<int> num_list) {
    int last = num_list[num_list.size() - 1];
    int before = num_list[num_list.size() - 2];
    int n = (last > before ? last - before : last * 2); 
    num_list.push_back(n);
    return num_list;
}