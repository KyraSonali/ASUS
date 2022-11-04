/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BACKEND;

import java.time.LocalDateTime;

/**
 *
 * @author Kyra Balliram
 */
public class MoodStat {
    
    private LocalDateTime date;
    private int userId;
    private int sleepScore;
    private int moodScore;
    private int exerciseScore;
    private int eatingScore;
    private String activities;

    public MoodStat(int inUserId,LocalDateTime inDate,int inSleepScore,int inMoodScore, int inExScore,int inEatingScore,String inActivities) {
        userId=inUserId;
        date =inDate;
        sleepScore = inSleepScore;
        moodScore = inMoodScore;
        exerciseScore = inExScore;
        eatingScore = inEatingScore;
        activities = inActivities;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public int getSleepScore() {
        return sleepScore;
    }

    public int getMoodScore() {
        return moodScore;
    }

    public int getExerciseScore() {
        return exerciseScore;
    }

    public int getEatingScore() {
        return eatingScore;
    }

    public String getActivities() {
        return activities;
    }
    
    
    
    
    
    
}
