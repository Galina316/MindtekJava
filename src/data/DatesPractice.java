package data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class DatesPractice {
    public static void main(String[] args) {
        //Date Library/api/in build classes and methods
        //List, Set , Map, Collection, Collections -> library/api/in build classes method
        //Streams api
        /*
        1. Date -> old,deprecated, non thread safe,mutable
        2. LocalDate -> new, thread safe ,immutable, rich with methods
         */

        LocalDate date = LocalDate.now();
        System.out.println(date);

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        LocalDate myDate = LocalDate.of(2020, Month.JANUARY,10);
        System.out.println(myDate);

        LocalDate twoWeeksAfter = date.plusWeeks(2);
        System.out.println(twoWeeksAfter);

        LocalDate twoWeeksBefore = date.minusWeeks(2);
        System.out.println(twoWeeksBefore);

        LocalDate customDate = LocalDate.now().minusDays(100);
        System.out.println(customDate.getDayOfWeek());
    }
}
