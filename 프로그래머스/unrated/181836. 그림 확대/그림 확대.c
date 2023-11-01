#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// picture_len은 배열 picture의 길이입니다.
// 파라미터로 주어지는 문자열은 const로 주어집니다. 변경하려면 문자열을 복사해서 사용하세요.
char** solution(const char* picture[], size_t picture_len, int k) {
    // return 값은 malloc 등 동적 할당을 사용해주세요. 할당 길이는 상황에 맞게 변경해주세요.
    char** answer = (char**)malloc(picture_len * k * sizeof(char*));
    for(int i = 0; i < picture_len; i++){
        int len = strlen(picture[i]);
        char* pic = (char*) malloc(len * k + 1);
        pic[len * k] = '\0';
        for(int j = 0; j < len; j++)
            for(int p = 0; p < k; p++)
                pic[j * k + p] = picture[i][j];
        for(int p = 0; p < k; p++)
            answer[i * k + p] = pic;
    }
    return answer;
}