import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.PriorityQueue;
import java.util.Map;
import java.util.HashMap;
class Word {
    String word;
    int cnt;
    public Word(String word, int cnt){
        this.word = word;
        this.cnt = cnt;
    }   
}
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < N; i++){
            String temp = br.readLine();
            if(temp.length() < M) continue;
            map.put(temp, map.getOrDefault(temp, 0) + 1);
        }
        PriorityQueue<Word> pq = new PriorityQueue<>((a,b)->{
        if (a.cnt != b.cnt) return b.cnt - a.cnt;
        else if(a.word.length() != b.word.length()) return b.word.length() - a.word.length();
        else return a.word.compareTo(b.word);
        });
        for(String key : map.keySet()){
            pq.offer(new Word(key,map.get(key)));
        }
        while(!pq.isEmpty()) {
            if(pq.size()!=1) sb.append(pq.poll().word).append("\n");
            else sb.append(pq.poll().word);
        }
        System.out.println(sb);
    }
}