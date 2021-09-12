package com.techreturners.exercise004;

import org.junit.Ignore;
import org.junit.Test;

import java.util.Random;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

import static org.junit.Assert.assertEquals;

public class Exercise004Test {

    @Test
    public void checkGetDateTimeWhenDateIsSpecified() {

        Exercise004 ex004 = new Exercise004(LocalDate.of(2021, Month.JULY, 19));
        LocalDateTime expected = LocalDateTime.of(2053, Month.MARCH, 27, 1, 46, 40);

        assertEquals(expected, ex004.getDateTime());
    }

    
    @Test
    public void checkGetDateTimeWhenBothDateAndTimeIsSpecified() {

        Exercise004 ex004 = new Exercise004(LocalDateTime.of(2021, Month.MARCH, 4, 23, 22, 0, 0));
        LocalDateTime expected = LocalDateTime.of(2052, Month.NOVEMBER, 11, 1, 8, 40);

        assertEquals(expected, ex004.getDateTime());
    }

    @Test
    public void checkGetDateTimeWhenBothDateAndTimeIsSpecifiedWithDayRollOver() {

        Exercise004 ex004 = new Exercise004(LocalDateTime.of(2021, Month.JANUARY, 24, 23, 59, 59, 0));
        LocalDateTime expected = LocalDateTime.of(2052, Month.OCTOBER, 03, 1, 46, 39);

        assertEquals(expected, ex004.getDateTime());
    }

    // *** additional test ***
    @Test
    public void checkGetDateTimeWhenCurrentTimeProvided() {
        LocalDateTime currentTime = LocalDateTime.now();
        Exercise004 ex004 = new Exercise004(currentTime);
        LocalDateTime expected = currentTime.plusSeconds(1000000000);
        assertEquals(expected, ex004.getDateTime());
    }

    @Test
    public void checkGetDateTimeWhenOneDateBeforeCurrentDateProvided() {
        LocalDate oneDateBefore = LocalDate.now().minusDays(1);
        Exercise004 ex004 = new Exercise004(oneDateBefore);
        LocalDateTime expected = oneDateBefore.atStartOfDay().plusSeconds(1000000000);
        assertEquals(expected, ex004.getDateTime());
    }

    @Test
    public void checkGetDateTimeWhenOneDateAfterCurrentDateProvided() {
        LocalDate oneDateAfter = LocalDate.now().plusDays(1);
        Exercise004 ex004 = new Exercise004(oneDateAfter);
        LocalDateTime expected = oneDateAfter.atStartOfDay().plusSeconds(1000000000);
        assertEquals(expected, ex004.getDateTime());
    }

    @Test
    public void checkGetDateTimeWhen50RandomTimesProvided() {
        Random random = new Random();
        for(int i=1;i<=50;i++) {

            int minDay = (int) LocalDate.of(1900, 1, 1).toEpochDay();
            int maxDay = (int) LocalDate.of(2065, 12, 31).toEpochDay();
            long randomDay = minDay + random.nextInt(maxDay - minDay);

            LocalDate randomDate = LocalDate.ofEpochDay(randomDay);
            Exercise004 ex004 = new Exercise004(randomDate);

            LocalDateTime expected = randomDate.atStartOfDay().plusSeconds(1000000000);
            assertEquals(expected, ex004.getDateTime());
        }
    }

}
