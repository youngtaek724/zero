package com.example.app.common.util;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TimeUtil {

    private static final String DEFAULT_DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";

    // Get the current time in the default time zone
    public static String getCurrentTime() {
        return getCurrentTime(DEFAULT_DATE_TIME_FORMAT);
    }

    // Get the current time in the specified format
    public static String getCurrentTime(String format) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
        LocalDateTime now = LocalDateTime.now();
        return now.format(formatter);
    }

    // Get the current time in the specified time zone
    public static String getCurrentTimeInZone(String timeZone) {
        return getCurrentTimeInZone(timeZone, DEFAULT_DATE_TIME_FORMAT);
    }

    // Get the current time in the specified time zone and format
    public static String getCurrentTimeInZone(String timeZone, String format) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
        ZonedDateTime now = ZonedDateTime.now(ZoneId.of(timeZone));
        return now.format(formatter);
    }

    // Calculate the difference between two LocalDateTime objects
    public static long calculateDifferenceInMinutes(LocalDateTime startTime, LocalDateTime endTime) {
        return java.time.Duration.between(startTime, endTime).toMinutes();
    }

    // Parse a string to LocalDateTime
    public static LocalDateTime parseStringToLocalDateTime(String dateTimeStr) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DEFAULT_DATE_TIME_FORMAT);
        return LocalDateTime.parse(dateTimeStr, formatter);
    }

    // Format LocalDateTime to string
    public static String formatLocalDateTime(LocalDateTime dateTime) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DEFAULT_DATE_TIME_FORMAT);
        return dateTime.format(formatter);
    }

    // Get current date
    public static String getCurrentDate() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDateTime now = LocalDateTime.now();
        return now.format(formatter);
    }

    // Get current time
    public static String getCurrentTimeOnly() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        return now.format(formatter);
    }
}
