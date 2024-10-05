#include <string>
#include <cmath>
#define _sum(x,y,z) ((x) + (y) + (z))
#define _powsums(x,y,z,d) (pow((x), (d)) + pow((y), (d)) + pow((z), (d)))
using namespace std;

int solution(int a, int b, int c) {
    if(a != b && a != c && b != c){
        return _sum(a,b,c);        
    }else if(a == b && b == c && a == c){
        return _sum(a,b,c) * _powsums(a, b, c, 2) * _powsums(a, b, c, 3); 
    }else{
        return _sum(a,b,c) * _powsums(a, b, c, 2); 
    }
    return 0;
}