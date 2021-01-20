package se.lexicon.samuel;


import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class App {
    public static void main(String[] args) {
        //LocalDate
//         System.out.println(LocalDate.now());
//         System.out.println(LocalDate.parse("2000-09-11"));
//
//            LocalDate today = LocalDate.now();
//            LocalDate nextBirthDay = LocalDate.parse("2020-09-11");
//            LocalDate nextBirthday = LocalDate.of(2020,9,11);
//
//            LocalDate myBirthDate = today.minusYears(44);
//            System.out.println(myBirthDate);

//        LocalDate nextBirthDay = LocalDate.parse("2020-09-11");
//
//        Month september = nextBirthDay.getMonth();
//        System.out.println(september);
//        int monthOfYear = nextBirthDay.getMonthValue();
//        System.out.println(monthOfYear);
//        //Month, DayOfTheWeek, Year are all enums
//        DayOfWeek friday = nextBirthDay.getDayOfWeek();
//        System.out.println(friday);
//        int dayOfYear = nextBirthDay.getDayOfYear();
//        System.out.println(dayOfYear);
//        int year = nextBirthDay.getYear();
//        System.out.println(year);
//        Year objYear = Year.of(year);
//        System.out.println(objYear);
//======================================================================================================================
        //LocalTime

//        LocalTime currentTime = LocalTime.now();
//        System.out.println(currentTime);
//        System.out.println(currentTime.truncatedTo(ChronoUnit.MINUTES));
//        System.out.println(currentTime.truncatedTo(ChronoUnit.SECONDS));
//
//        //Chrono is used when you want to define a specific time unit
//
//        LocalTime lunch = LocalTime.of(12,0);
//        System.out.println(lunch);
//        LocalTime startTime = LocalTime.parse("08:15");
//        System.out.println(startTime);
//        LocalTime endTime = LocalTime.parse("16:00");
//        System.out.println(endTime);
//======================================================================================================================

        //Adding and removing to LocalDate
//        LocalTime localTime = LocalTime.parse("13:35").plusHours(1).plusMinutes(5).minusSeconds(5);
//        System.out.println(localTime);
//
//        //using getters
//
//        LocalTime localTime1 = LocalTime.parse("13:35:59");
//        int hour = localTime1.getHour();
//        int minutes = localTime1.getMinute();
//        int seconds = localTime1.getSecond();
//        System.out.println("Hours value is: " + hour + "hr " + "minutes: " + minutes + "mins " + " seconds: " + seconds + "secs");
//
//        LocalTime min = LocalTime.MIN;
//        System.out.println(min);
//        LocalTime max = LocalTime.MAX;
//        System.out.println(max);
//        LocalTime noon = LocalTime.NOON;
//        System.out.println(noon);
//        LocalTime midnight = LocalTime.MIDNIGHT;
//        System.out.println(midnight);

        //LocalDateTime
//        LocalDateTime now = LocalDateTime.now();
//        System.out.println(now);
//
//        LocalDateTime endOfWorkWeek = LocalDateTime.parse("2020-01-03T17:00");
//        System.out.println(endOfWorkWeek);
//
//        LocalDate date = LocalDate.parse("2020-03-15");
//        LocalTime time = LocalTime.parse("09:30");
//        LocalDateTime dateTime = LocalDateTime.of(date,time);
//        System.out.println(dateTime);

        //DateTimeFormatter

        LocalDate march25 = LocalDate.parse("2020-03-25");
        String basicISODateString = march25.format(DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println(basicISODateString);

        //ISO_DATE returns in this format 2020-03-25
        String isoDateString = march25.format(DateTimeFormatter.ISO_DATE);
        System.out.println(isoDateString);

        //using a defined pattern and returning how we want i.e Wednesday 25 Mar 2020
        String custom = march25.format(DateTimeFormatter.ofPattern("eeee dd MMM YYYY"));
        System.out.println(custom);

        //Period used to measure quantity of time in terms of year, Month and days.
        LocalDate originalMeetingDate = LocalDate.parse("2020-11-11");
        LocalDate postponedMeetingDate = originalMeetingDate.plus(Period.ofMonths(2));
        System.out.println(postponedMeetingDate);

        //Duration
        LocalTime start = LocalTime.MIDNIGHT;
        LocalTime now = LocalTime.parse("15:23");

        Duration durationSinceStart = Duration.between(start,now);
        System.out.println(durationSinceStart);
        long seconds = durationSinceStart.getSeconds();
        System.out.println(seconds);

    }
}
