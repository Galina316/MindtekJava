package data;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class TaskTwo {
    public static void main(String[] args) {
        String [] birthdays ={"John Doe 2000.05.15",
                "Rajesh dandeey 1995.02.18",
                "Kim Yan 1999.11.20"};
        /*
        1 find average total days for all employees (days)/3 = average
         */

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
        long totalDays=0;
        for(String data:birthdays){
            String birthD= data.substring(data.lastIndexOf(" ")+1);
            LocalDate date = LocalDate.parse(birthD,formatter);
            long days = ChronoUnit.DAYS.between(date,LocalDate.now());
            totalDays+=days;

        }
        System.out.println("Average total days: "+totalDays/birthdays.length);

    }
}
