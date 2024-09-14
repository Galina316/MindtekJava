package data;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Task {
    public static void main(String[] args) {
        String [] checkInAndCheckOut ={"John Smith CI:24/02/21 CO:24/02/23","Patel Harsh CI:24/03/10 CO:24/03/24","Kim Yan CI:24/05/11 CO:24/06/19"};

        int totalDays = 0;
        int totalMonth =0;

        long totalDaysOnly=0;

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yy/MM/dd");

        for(String data :checkInAndCheckOut){
            String CI = data.substring(data.indexOf(":")+1,data.lastIndexOf(" "));
            String CO = data.substring(data.lastIndexOf(":")+1);
            LocalDate checkIn = LocalDate.parse(CI,formatter);
            LocalDate checkOut = LocalDate.parse(CO,formatter);
            Period period= Period.between(checkIn,checkOut);
            totalDays+=period.getDays();
            totalMonth+=period.getMonths();
            totalDaysOnly += ChronoUnit.DAYS.between(checkIn,checkOut);
        }
        System.out.println("Days : "+totalDays);
        System.out.println("Months: "+totalMonth);
        System.out.println("Total days only: "+totalDaysOnly);
    }
}
