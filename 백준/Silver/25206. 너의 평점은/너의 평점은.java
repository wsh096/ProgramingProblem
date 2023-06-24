import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    static final Map<String, Double> MAP = new HashMap<>();
    static{
        MAP.put("A+", 4.5);
        MAP.put("A0", 4.0);
        MAP.put("B+", 3.5);
        MAP.put("B0", 3.0);
        MAP.put("C+", 2.5);
        MAP.put("C0", 2.0);
        MAP.put("D+", 1.5);
        MAP.put("D0", 1.0); 
        MAP.put("F" , 0.0);
    }
    public static void main(String[] args) throws IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       double totalAll = 0; //분자
       double totalGrade = 0; //분모 
       for(int i = 0; i < 20; i++){
        String[] input = br.readLine().split(" ");
        if(input[2].equals("P")) continue;
        else{
            double grade = Double.parseDouble(input[1]);
            totalAll += grade * MAP.get(input[2]);
            totalGrade +=grade;
        }
       }
       System.out.printf("%4f",totalAll/totalGrade);
       br.close();
    }    
}