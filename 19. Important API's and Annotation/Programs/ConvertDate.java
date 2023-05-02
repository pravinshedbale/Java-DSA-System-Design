import java.time.*;
import java.time.format.DateTimeFormatter;

public class ConvertDate {

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formattedDate = date.format(formatter);
        System.out.println(formattedDate);
    }

}
