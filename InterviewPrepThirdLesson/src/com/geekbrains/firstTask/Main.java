package com.geekbrains.firstTask;

public class Main {
    public static void main(String[] args) {
        Runnable runnable1 = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Ping " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Thread.yield();
            }
        };
        Runnable runnable2 = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Pong " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Thread.yield();
            }
        };

        Thread t1 = new Thread(runnable1);
        Thread t2 = new Thread(runnable2);
        t1.start();
        t2.start();

    }
}
