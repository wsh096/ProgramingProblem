import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(String[] maps) {
        
        int[] s = new int[3];
        int[] l = new int[3];
        int[] e = new int[3];
        int cnt = 0;
exit_l: for (int i = 0; i < maps.length; i++) {
            for (int j = 0; j < maps[0].length(); j++) {
                char temp = maps[i].charAt(j);
                if(cnt >= 3){
                    break exit_l;
                }
                switch (temp) {
                    case 'S':
                        s[0] = i;
                        s[1] = j;
                        cnt++;
                        break;
                    case 'L':
                        l[0] = i;
                        l[1] = j;
                        cnt++;
                        break;
                    case 'E':
                        e[0] = i;
                        e[1] = j;
                        cnt++;
                        break;
                }
            }
        }
        l[2] = miro(s, l, maps);
        if(l[2] == -1){
            return -1;
        }
         return miro(l, e, maps);
        }
    
    private int miro(int[] start, int[] target, String[] maps) {
        boolean[][] visited = new boolean[maps.length][maps[0].length()];
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};
        Queue<int[]> bfs = new LinkedList<>();
        bfs.offer(start);
        visited[start[0]][start[1]] = true;
        while (!bfs.isEmpty()) {
            int[] cur = bfs.poll();
            if(cur[0] == target[0] && cur[1] == target[1]) {
                        return cur[2];
                    } 
            for (int i = 0; i < 4; i++) {
                int nx = cur[0] + dx[i];
                int ny = cur[1] + dy[i];
                if (nx < 0 || ny < 0 || nx >= visited.length || ny >= visited[0].length || visited[nx][ny] || maps[nx].charAt(ny) == 'X') {
                    continue;
                }else{
                        bfs.offer(new int[] { nx, ny, cur[2] + 1 });
                        visited[nx][ny] = true;
                    }
                }
            }
        return -1;
    }
}
