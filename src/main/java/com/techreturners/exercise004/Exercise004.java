package com.techreturners.exercise004;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Exercise004 {
    private LocalDateTime inTime;
    public Exercise004(LocalDate date) {
        inTime = date.atStartOfDay();
    }

    public Exercise004(LocalDateTime dateTime) {
        inTime = dateTime;
    }

    public LocalDateTime getDateTime() {
        return inTime.plusSeconds(1000000000);
    }
}
