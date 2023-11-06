#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// arr_rows는 2차원 배열 arr의 행 길이, arr_cols는 2차원 배열 arr의 열 길이입니다.
int** solution(int** arr, size_t arr_rows, size_t arr_cols) {
    // return 값은 malloc 등 동적 할당을 사용해주세요. 할당 길이는 상황에 맞게 변경해주세요.
    int size = arr_cols > arr_rows ? arr_cols : arr_rows;
    int** answer = (int**)malloc(size * sizeof(int*));
    for(int r = 0; r < size; r++){
        answer[r] = (int*)calloc(size, sizeof(int));
        if(r >= arr_rows) continue;
        for(int c = 0; c < arr_cols; c++) answer[r][c] = arr[r][c];
    }
    return answer;
}