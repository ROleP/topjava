package ru.javawebinar.topjava.util;

import java.time.LocalTime;

/**
 * Created by rolep on 29/04/17.
 */
public class TimeUtil {
    public static boolean isBetween(LocalTime lt, LocalTime startTime, LocalTime endTime) {
        return lt.compareTo(startTime) >= 0 && lt.compareTo(endTime) <= 0;
    }
}
