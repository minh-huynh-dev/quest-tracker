package com.quest.tracker.service;

import com.quest.tracker.model.Tracker;
import org.springframework.stereotype.Service;

@Service
public class CalendarService {

    public double getDailyCompletion(Tracker tracker) {
        double percentage = -1; // will cause error
        int dailies = tracker.getDailies().size();
        int count = 0;

        for (int i = 0; i < dailies; i++) {
            if (tracker.getDailies().get(i).getIsComplete()) {
                count++;
            }
        }
        percentage = count / dailies;
        return percentage;
    }

    public double getWeeklyCompletion(Tracker tracker) {
        double percentage = -1;
        int weeklies = tracker.getWeeklies().size();
        int count = 0;

        for (int i = 0; i < weeklies; i++) {
            if (tracker.getDailies().get(i).getIsComplete()) {
                count++;
            }
        }
        percentage = count / weeklies;
        return percentage;
    }

    public double getTotalCompletion(Tracker tracker) {
        double percentage = -1;
        double dailyQuests = getDailyCompletion(tracker) * tracker.getDailies().size();
        double weeklyQuests = getWeeklyCompletion(tracker) * tracker.getWeeklies().size();

        int totalQuests = tracker.getDailies().size() + tracker.getWeeklies().size();

        percentage = (dailyQuests + weeklyQuests) / totalQuests;
        return percentage;
    }

}
