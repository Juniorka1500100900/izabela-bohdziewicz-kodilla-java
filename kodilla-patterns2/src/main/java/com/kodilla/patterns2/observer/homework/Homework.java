package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class Homework implements HomeworkObservable {
    private List<Mentor> mentors = new ArrayList<>();
    private List<String> tasks = new ArrayList<>();

    @Override
    public void addObserver(Mentor mentor) {
        mentors.add(mentor);
    }

    @Override
    public void removeObserver(Mentor mentor) {
        mentors.remove(mentor);
    }

    @Override
    public void notifyObservers(String task) {
        for (Mentor mentor : mentors) {
            mentor.update(this, task);
        }
    }

    public void addTask(String task) {
        tasks.add(task);
        notifyObservers(task);
    }

    public List<String> getTasks() {
        return tasks;
    }
}