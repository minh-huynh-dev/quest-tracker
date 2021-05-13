package com.quest.tracker.controller;


import com.quest.tracker.model.Quest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

//localhost:8080
@RestController
@RequestMapping("/tracker")
public class QuestTrackerController {

    @GetMapping("/quest")
    public Quest getQuest(){
        Quest quest = new Quest();
        quest.setName("Maple Hotel");
        quest.setExpirationDate(new Date());
        return quest;
    }
}
