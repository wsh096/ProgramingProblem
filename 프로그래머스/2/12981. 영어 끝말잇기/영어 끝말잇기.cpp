#include <string>
#include <vector>
#include <iostream>
#include <unordered_set>
using namespace std;
char end_char(string str){
    return str[str.size() - 1];
}
vector<int> solution(int n, vector<string> words) {
    // n people 5면 1,2,3,4,5 
    // turn if i % n == 0; <첫 놈이 하는 순간 turn + 1
    // set으로 동일 단어 나오는지 관리
    int people = 2;
    int turn = 1;
    unordered_set<string> game_words;
    game_words.insert(words[0]);
    char before_end = end_char(words[0]);
    for(int i = 1; i < words.size(); i++){
        char first_word = words[i][0];
        if(i % n == 0){
            turn += 1;
            people = 1;
        }
        if(game_words.find(words[i]) != game_words.end()){
            return {people, turn};
        }else if(before_end != first_word){
            return {people, turn};
        }
        else{
            game_words.insert(words[i]);
        }
        before_end = end_char(words[i]);
        people++;
    }
    //default;
    return {0, 0};
}