#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int n) {
    //1~7 <- 1
    //8~14 <- 2
    //int carry = n/7;
    bool flag = (n % 7 == 0);
    if(flag){
       return n / 7;
    }
    return n/7 + 1;
}