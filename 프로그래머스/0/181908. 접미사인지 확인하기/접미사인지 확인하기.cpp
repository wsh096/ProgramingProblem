#include <string>
#include <vector>

using namespace std;

int solution(string my_string, string is_suffix) {
    int i = my_string.size() - 1;
    int j = is_suffix.size() - 1;
    while(j >= 0){
        if(my_string[i] == is_suffix[j]){
            i--;
            j--;
        }else{
            return 0;
        }
    }
            return 1;
}