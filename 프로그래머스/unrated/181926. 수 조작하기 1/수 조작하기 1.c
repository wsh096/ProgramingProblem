#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// 파라미터로 주어지는 문자열은 const로 주어집니다. 변경하려면 문자열을 복사해서 사용하세요.
int solution(int n, const char* control) {
    char * cpy = control - 1;
    while(*++cpy){
        if(* cpy == 'w') n++;
        else if(* cpy == 's') n--;
        else if(* cpy == 'd') n += 10;
        else n -= 10;
    }
    return n;
}