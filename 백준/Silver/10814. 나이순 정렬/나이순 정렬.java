import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
class People{
    int age;
    String name;
    int idx;
    People(int age, String name, int idx){
        this.age = age;
        this.name = name;
        this.idx = idx;
    }
}

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        List<People> list = new ArrayList<>();
        for(int i = 0; i < A; i++){
            String [] input = br.readLine().split(" ");
            list.add(new People(Integer.parseInt(input[0]),input[1],i));
        }
        Collections.sort(list, (a,b)->{if(a.age==b.age) return a.idx-b.idx; else return a.age-b.age;});

       StringBuilder sb = new StringBuilder();
        for(People people : list)
            sb.append(people.age).append(" ").append(people.name).append("\n");
       System.out.println(sb);
        
    }
}  