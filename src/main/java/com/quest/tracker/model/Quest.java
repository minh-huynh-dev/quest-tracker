package com.quest.tracker.model;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Data
public class Quest {
    private String name;
    private Date expirationDate;
}
