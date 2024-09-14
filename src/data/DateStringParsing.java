package data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DateStringParsing {
    public static void main(String[] args) {


        String date = "2024-03-16";
        // String convert LocalDate
        LocalDate parseDate = LocalDate.parse(date);
        System.out.println(parseDate.getDayOfWeek()+" "+parseDate);

        LocalDate todayDate = LocalDate.now();
        //todayDate -ParsedDate

        Period period = Period.between(parseDate,todayDate);

        int days = period.getDays();
        System.out.println("Days since we started the classes: "+period);

        //HH->00-24
        //hh->00-11 AM or PM->'a'

        String myDate = "2024/08/02/06:22 AM";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd/hh:mm a");


        LocalDateTime mockInterviewDate = LocalDateTime.parse(myDate,formatter);
        System.out.println(mockInterviewDate);
    }
}
