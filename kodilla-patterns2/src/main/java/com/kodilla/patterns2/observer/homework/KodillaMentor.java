package com.kodilla.patterns2.observer.homework;


import java.util.List;

public class KodillaMentor implements Mentor {
    private String mentorName;
    private List<String> receivedTasks;

    public KodillaMentor(String mentorName) {
        this.mentorName = mentorName;
    }

    @Override
    public void update(HomeworkObservable homework, String task) {
        System.out.println("Mentor " + mentorName + ": New task received - " + task);
    }

    public List<String> getReceivedTasks() {
        return receivedTasks;
    }
}
