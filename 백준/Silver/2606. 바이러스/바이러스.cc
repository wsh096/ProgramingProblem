#include <iostream>
#include <vector>
#include <queue>
using namespace std;
int main(void){
    int answer = 0;
    int N, M;
    cin >> N >> M;
    vector<vector<int>> graph(N + 1);
    for(int i = 0; i < M; i++){
        int x, y;
        cin >> x >> y;
        graph[x].push_back(y);
        graph[y].push_back(x);
    }    
    vector<bool> visited(N + 1, false);
    queue<int> q;
    q.push(1);
    visited[1] = true;
    while(!q.empty()){
        int cur = q.front();
        q.pop();
        for(int next : graph[cur]){
            if(!visited[next]){
                visited[next] = true;
                q.push(next);
                answer++;
            }
        }
    }
    
    cout << answer << endl;
    return 0;
}