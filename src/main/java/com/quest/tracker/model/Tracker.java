package com.quest.tracker.model;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Component
@Data
public class Tracker {

    List<Quest> dailies;
    List<Quest> weeklies;
    Calendar calendar;

    @Component
    @Data
    public class Quest {
        private String name;
        private Date expirationDate;
        private Boolean isWeekly;
        private Boolean isComplete;
    }

}
