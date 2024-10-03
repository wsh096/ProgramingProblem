#include <string>
#include <vector>

using namespace std;

int solution(vector<vector<int>> triangle) {
    int vectorsize = triangle.size() - 1; // 0~499;
    while(vectorsize > 0){
    for(int i = 0; i < vectorsize ; i++){
            triangle[vectorsize-1][i] += max(triangle[vectorsize][i], triangle[vectorsize][i + 1]);
        }
        vectorsize--;
    }
    return triangle[0][0];
}