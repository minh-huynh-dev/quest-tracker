package com.quest.tracker.model;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
@Data
public class Calendar {

    List<Quest> quest;

    @Component
    @Data
    private class Quest {
        private String name;
        private Date expirationDate;
        private Boolean isWeekly;
    }

}
