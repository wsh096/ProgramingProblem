#include <string>
#include <vector>

using namespace std;
vector<int> dx = {0, 1, 0, -1};
vector<int> dy = {1, 0, -1, 0};

int solution(vector<vector<string>> board, int h, int w) {
    int answer = 0;
    for(int i = 0 ; i < 4 ; i++)
    {
        int h_check = h + dx[i];
        int w_check = w + dy[i];
        if(h_check < 0 || h_check >= board.size() || w_check < 0 || w_check >= board[0].size()){
            continue;
        }else if(board[h_check][w_check] == board[h][w]) {
            answer++;
        }
    }
    return answer;
}