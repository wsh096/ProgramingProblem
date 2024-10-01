#include <iostream>
#include <queue>
#include <array>

using namespace std;

int N, M;
bool** visited;
int dx[] = {0, 1, 0, -1};
int dy[] = {1, 0, -1, 0};

int main() {
    cin >> N >> M;
   
    visited = new bool*[N];
    // 맵 입력 및 visited 배열 초기화
    for (int i = 0; i < N; i++) {
        visited[i] = new bool[M];
        string x;
        cin >> x;
        for (int j = 0; j < M; j++) {
            visited[i][j] = (x[j] == '0'); // 0이면 이동 못함
        }
    }

    // BFS 시작
    queue<array<int, 3>> q; // (x, y, 거리)
    q.push({0, 0, 1}); // 시작점
    visited[0][0] = true; // 시작점은 방문 처리

    while (!q.empty()) {
        array<int, 3> temp = q.front(); // 큐에서 첫 번째 요소를 가져옵니다.
        q.pop();

        if (temp[0] == N - 1 && temp[1] == M - 1) {
            cout << temp[2] << endl;
            return 0; // 종료
        }

        for (int i = 0; i < 4; i++) {
            int nx = temp[0] + dx[i];
            int ny = temp[1] + dy[i];
            if (nx < 0 || ny < 0 || nx >= N || ny >= M || visited[nx][ny]) {
                continue;
            }
            visited[nx][ny] = true; // 방문 처리
            q.push({nx, ny, temp[2] + 1});
        }
    }
    return 0;
}
