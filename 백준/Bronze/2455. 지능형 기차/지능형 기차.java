import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int maxPassengers = 0; // 최대 사람 수 변수 초기화

        int currentPassengers = 0; // 현재 탑승 인원 변수 초기화

        // 4개의 역에 대해 반복문 수행
        for (int i = 0; i < 4; i++) {
            String[] input = br.readLine().split(" ");
            int getOff = Integer.parseInt(input[0]); // 내린 사람 수
            int getOn = Integer.parseInt(input[1]); // 탄 사람 수

            currentPassengers -= getOff; // 내린 사람 처리
            currentPassengers += getOn; // 탄 사람 처리

            maxPassengers = Math.max(maxPassengers, currentPassengers); // 최대 사람 수 업데이트
        }

        System.out.println(maxPassengers);
    }
}