package com.kodilla.patterns2.observer.homework;

public interface HomeworkObservable {
    void addObserver(Mentor mentor);
    void removeObserver(Mentor mentor);
    void notifyObservers(String task);
}