package com.geekbrains.secondTask;

import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        ReentrantLock locker = new ReentrantLock();
        for (int i = 0; i < 50; i++) {
            Thread thread = new Thread(new IncrementService(counter, locker));
            thread.start();
        }
    }
}
