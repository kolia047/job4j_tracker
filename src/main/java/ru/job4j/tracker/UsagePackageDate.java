package ru.job4j.tracker;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class UsagePackageDate {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        System.out.println("Текущая дата: " + currentDate);

        LocalTime currentTime = LocalTime.now();
        System.out.println("Текущее время: " + currentTime);

        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Дата и время: " + currentDateTime);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
        String currentDateTimeFormat = currentDateTime.format(formatter);
        System.out.println("После форматирования: " + currentDateTimeFormat);
    }
}
