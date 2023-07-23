#include <stdio.h>
long fact(int n){
    if(n <= 1) return 1;
    return n*fact(n-1);
}
int main(void){
    long n;
    scanf("%ld", &n);
    printf("%ld",fact(n));
    return 0;
}
