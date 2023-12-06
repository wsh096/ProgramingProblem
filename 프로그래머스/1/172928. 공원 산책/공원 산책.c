#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
#include <string.h>

const int dr[] = {-1, 0, 1, 0};
const int dc[] = {0, 1, 0, -1};
int dd[128];
int R, C, r, c;
char** P;

void move(int d, int s){
    int nr = r, nc = c;
    while(s--){
        nr += dr[d], nc += dc[d];
        if(nr < 0 || nr >= R || nc < 0 || nc >= C) return;
        if(P[nr][nc] == 'X') return;
    }
    r = nr, c = nc;
}

int* solution(const char* park[], size_t park_len, const char* routes[], size_t routes_len) {
    dd['N'] = 0, dd['E'] = 1, dd['S'] = 2, dd['W'] = 3;
    int* answer = (int*)malloc(2 * sizeof(int));
    R = park_len, C = strlen(park[0]); P = park;
    int flag = 0;
    for(r = 0; r < R; r++){
        for(c = 0; c < C; c++){
            if(P[r][c] == 'S'){
                flag = 1;
                break;
            }
        }
        if(flag) break;
    }
    for(int i = 0; i < routes_len; i++){
        move(dd[routes[i][0]], routes[i][2] - '0');
    }
    answer[0] = r, answer[1] = c;
    return answer;
}