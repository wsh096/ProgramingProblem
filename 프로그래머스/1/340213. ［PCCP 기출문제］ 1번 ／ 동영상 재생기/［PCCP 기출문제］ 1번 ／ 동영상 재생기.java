import java.util.*;

class Solution {
    static int TIME;
    static int OPSTART;
    static int OPEND;
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {

        // 10초 전 이동
        // 10초 후 이동
        // op 건너 뛰기
        
        // 1. Video_len(동영상 길이)
    
        // 기능 수행 전 재생 위치 pos로 관리
        
        // op 관리 op_start/stop <- op 구간 자동 건너 뜀
        
        // 사용자의 입력 (commands[]) prev/next
        
        // return mm:ss 형식으로 (시간 형식으로 formating)
        TIME = TimeToInt(video_len);
        int current_pos = TimeToInt(pos);
        OPSTART = TimeToInt(op_start);
        OPEND = TimeToInt(op_end);
        
        //1. 시작 부터의 op 범위 여부 확인
        current_pos = opJump(current_pos);
        for(String cmd : commands)
        {
            switch(cmd)
            {
                case "prev":
                    current_pos = prevLogic(current_pos);
                    break;
                case "next":
                    current_pos = nextLogic(current_pos);
                    break;
            }
            current_pos = opJump(current_pos);
        }
        return IntToTime(current_pos);
}
    private int TimeToInt(String time)
    {
        //mm:ss -> :를 통한 포맷팅
        int mm = Integer.parseInt(time.substring(0, 2)) * 60;
        int ss = Integer.parseInt(time.substring(3));
        return mm + ss;
}
    private String IntToTime(int time) {
   int mm = time / 60;
   int ss = time - (mm * 60);
   StringBuilder sb = new StringBuilder();
   if(mm < 10) {
     sb.append("0").append(mm);
   } else {
     sb.append(mm);
   }
     sb.append(":");
   if(ss < 10) {
     sb.append("0").append(ss);
   } else {
     sb.append(ss);
   }         
 return sb.toString();
}
private int prevLogic(int pos) {
   return (pos - 10 <= 0) ? 0 : pos - 10;
}
private int nextLogic(int pos) {
  return (pos + 10 >= TIME) ? TIME : pos + 10;
}
private int opJump(int pos) {
  if(pos >= OPSTART && pos <= OPEND) {
     pos = OPEND;
  }
  return pos;
}    

    

}