#include <string>
#include <vector>

using namespace std;

int gcd(int a,int b){
    if(b == 0){
        return a;
    }
    return gcd(b, a % b);
}
int lcm(int a, int b){
    return (a * b) / gcd(a, b); //최대 공약수lcm = (a*b) / (a, b)의 최소 공배수
}
    
int solution(vector<int> arr) {
    //정렬 없이 진행
    int answer = arr[0];
    if(arr.size() == 1) return arr[0];
    for(int i = 1; i < arr.size(); i++){
        answer = lcm(answer, arr[i]);
    }
    return answer;
}