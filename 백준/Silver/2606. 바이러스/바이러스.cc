#include <iostream>
#include <vector>
#include <queue>

using namespace std;

int main() {
    int N, M;
    cin >> N >> M;

    vector<vector<int>> graph(N + 1); 

    for (int i = 0; i < M; i++) {
        int x, y;
        cin >> x >> y; 
        graph[x].push_back(y);
        graph[y].push_back(x);
    }

    vector<bool> visited(N + 1, false);
    queue<int> q;
    q.push(1); 
    visited[1] = true;
    int answer = 0;

    while (!q.empty()) {
        int cur = q.front();
        q.pop();
        for (int neighbor : graph[cur]) {
            if (!visited[neighbor]) {
                visited[neighbor] = true;
                q.push(neighbor);
                answer++;
            }
        }
    }

    cout << answer << endl;
    return 0;
}
