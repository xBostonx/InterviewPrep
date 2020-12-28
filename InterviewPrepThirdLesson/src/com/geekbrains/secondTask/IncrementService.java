package com.geekbrains.secondTask;

import java.util.concurrent.locks.ReentrantLock;

public class IncrementService implements Runnable {
    private Counter counter;
    private ReentrantLock locker;

    public IncrementService(Counter counter, ReentrantLock lock) {
        this.counter = counter;
        locker = lock;
    }

    @Override
    public void run() {
        locker.lock();
        int currentValue = counter.getValue();
        System.out.println("Current counter value is " + currentValue);
        try {
            Thread.sleep(300);
            int newValue = ++currentValue;
            counter.setValue(newValue);
            System.out.println("New counter value is " + newValue);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            locker.unlock();
        }
    }
}
