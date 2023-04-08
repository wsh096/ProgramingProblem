import java.util.Scanner;

public class Main{
    static Scanner sc = new Scanner(System.in);
    static int T;
    static int x1, y1;
    static int x2, y2;
    static int n;
    public static void main(String[] args){
        T = sc.nextInt();
        while(T > 0){
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        x2 = sc.nextInt();
        y2 = sc.nextInt();
        n = sc.nextInt();
        int answer = 0;
        //두 점 사이의 거리가 반지름 보다 크면 피해갈 수 있으며
        //(크지 않다면)작거나 같으면 피할 수 없음
        for(int i = 0; i < n; i++){
            int[] 행성계 = new int[3];
            행성계[0] = sc.nextInt();
            행성계[1] = sc.nextInt();
            행성계[2] = sc.nextInt();
            //시작점과 도착점 두 점 사이의 거리가 반지름 보다 클 때라는 대전제
            if(!(Math.sqrt(Math.pow(x2-행성계[0],2) + Math.pow(y2-행성계[1],2)) <= 행성계[2]
                 &&Math.sqrt(Math.pow(x1-행성계[0],2) + Math.pow(y1-행성계[1],2)) <= 행성계[2])
               && (Math.sqrt(Math.pow(x2-행성계[0],2) + Math.pow(y2-행성계[1],2)) <= 행성계[2]||
              Math.sqrt(Math.pow(x1-행성계[0],2) + Math.pow(y1-행성계[1],2)) <= 행성계[2]))
                answer++;
            }
        System.out.println(answer);
        T--;
    }
}
}