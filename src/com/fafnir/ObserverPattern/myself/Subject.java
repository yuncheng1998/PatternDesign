package com.fafnir.ObserverPattern.myself;

import java.util.ArrayList;

interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(ArrayList<Observer> observers);
}
