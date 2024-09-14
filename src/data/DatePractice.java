package data;

import java.time.LocalDateTime;
import java.time.Month;

public class DatePractice {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.of(2024, Month.MAY,25,12,00,20);
        System.out.println(dateTime);
    }
}
