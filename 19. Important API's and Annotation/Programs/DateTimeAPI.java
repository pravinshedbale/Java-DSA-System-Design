import java.time.*;

public class DateTimeAPI {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();

        int day = date.getDayOfMonth();
        int month = date.getMonthValue();
        int year = date.getYear();

        System.out.println(day + "/" + month + "/" + year);

        LocalTime time = LocalTime.now();

        int hrs = time.getHour();
        int min = time.getMinute();
        int sec = time.getSecond();

        System.out.println(hrs + ":" + min + ":" + sec);
    }
}
