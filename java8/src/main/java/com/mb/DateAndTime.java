package com.mb;

import java.time.*;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.Set;

public class DateAndTime {
    public void print() {
        /* Date Expressions */
        System.out.println("---------------Date-------------------");
        System.out.println(LocalDate.of(1988, 07, 16));
        System.out.println(LocalDate.of(1988, Month.AUGUST, 16));
        System.out.println(LocalDate.now());
        System.out.println(LocalDate.now().withYear(2016));
        System.out.println(LocalDate.now().withYear(2016).withDayOfMonth(16).withMonth(4));
        System.out.println(LocalDate.now().with(ChronoField.YEAR, 2013).with(ChronoField.MONTH_OF_YEAR, 2).with(ChronoField.DAY_OF_MONTH, 10));

        System.out.println(LocalDate.now().plusWeeks(2).plusDays(2).plusYears(1));
        System.out.println(LocalDate.now().plus(2, ChronoUnit.DAYS).minus(2, ChronoUnit.YEARS).plus(2, ChronoUnit.MONTHS).plus(2, ChronoUnit.DECADES));
        System.out.println("---------------Localtime-------------------");
        System.out.println(LocalTime.of(18, 20, 55).getHour());
        System.out.println(LocalTime.of(18, 20, 55).getSecond());
        System.out.println(LocalTime.of(18, 20, 55).getMinute());
        System.out.println(LocalTime.NOON);
        System.out.println(LocalTime.MIDNIGHT);
        System.out.println(LocalTime.parse("10:05"));
        System.out.println(LocalTime.now().plusHours(2).plusMinutes(10).plusSeconds(20).minus(3, ChronoUnit.SECONDS));
        System.out.println("---------------LocalDateTime-------------------");
        System.out.println(LocalDateTime.now());
        System.out.println(LocalDateTime.MAX.getDayOfMonth());
        System.out.println(LocalDateTime.now().toLocalDate());
        System.out.println(LocalDateTime.now().toLocalTime());
        System.out.println(LocalDateTime.now().minusDays(3).plusSeconds(33).plus(4, ChronoUnit.MINUTES));

        System.out.println("---------------ZoneId-------------------");
        Set<String> zones = ZoneId.getAvailableZoneIds();
        zones.stream().sorted().forEach(System.out::println);
        System.out.println("Current Zone : " + ZoneId.systemDefault());

        System.out.println("---------------ZonedDateTime-------------------");
        System.out.println(ZonedDateTime.now());
        ZoneId istanbul = ZoneId.of("Europe/Istanbul");
        System.out.println(ZonedDateTime.now(istanbul));
        System.out.println(ZonedDateTime.now(ZoneId.of("Japan")));
        System.out.println(ZonedDateTime.now(ZoneId.of("Japan")).toLocalDate());
        System.out.println(ZonedDateTime.now(ZoneId.of("Japan")).toLocalTime());
    }
}
