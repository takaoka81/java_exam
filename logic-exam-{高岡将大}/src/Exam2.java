import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Exam2 {
    public static void main(String[] args) {

        time(11, 59, 59);

    }

    public static void time(int hour, int minits, int seconds) {
        LocalTime time = LocalTime.of(hour, minits, seconds);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("H時m分s秒");
        String format = time.format(formatter);
        System.out.print(format + "の1秒後は");

        time = time.plusSeconds(1);
        String plueFormat = time.format(formatter);
        System.out.print(plueFormat + "です");

    }
}
