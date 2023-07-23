#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
#include <string.h>
// 파라미터로 주어지는 문자열은 const로 주어집니다. 변경하려면 문자열을 복사해서 사용하세요.
char** solution(const char* my_string) {
    int word_cnt = 1;
    for(int i = 0; my_string[i] != NULL; i++){
        if(my_string[i] == '\\s'&&my_string[i+1] != '\\s'){
            word_cnt++;
        }        
    }
    // return 값은 malloc 등 동적 할당을 사용해주세요. 할당 길이는 상황에 맞게 변경해주세요.
    char** answer = (char**)malloc(sizeof(char*) * word_cnt);
    char* token = strtok(my_string, " ");
    int i = 0;
    while(token != NULL){
        //answer[i] = (char*)malloc(sizeof(char) * (strlen(token) + 1));
        answer[i++] = token;
        token = strtok(NULL, " ");
    }
         
    return answer;
}