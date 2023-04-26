import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
public class Main{
    public static void main(String[] args){
        ZoneId seoulZoneId = ZoneId.of("Asia/Seoul");
        ZonedDateTime seoulTime = ZonedDateTime.of(LocalDateTime.now(), seoulZoneId);
        String nowSeoulTime = seoulTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println(nowSeoulTime);
    }
}