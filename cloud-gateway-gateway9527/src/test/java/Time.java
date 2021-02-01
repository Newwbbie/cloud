import java.time.ZonedDateTime;

/**
 * @auther wb
 * @create 2021/2/1
 **/
public class Time {
    public static void main(String[] args) {
        ZonedDateTime time = ZonedDateTime.now();
        System.out.println(time);
        // 2021-02-01T15:10:17.951+08:00[Asia/Shanghai]
    }
}
