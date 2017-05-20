package com.javarush.task.task25.task2508;

public class TaskManipulator implements Runnable, CustomThreadManipulator {
    Thread thread;
    String threadName;

    @Override
    public void start(String threadName) {
        this.threadName = threadName;
        thread = new Thread(this, threadName);
        thread.start();
    }

    @Override
    public void stop() {
        thread.interrupt();
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        while (!Thread.currentThread().isInterrupted()) {
            try {
                Thread.sleep(100);
                System.out.println(Thread.currentThread().getName());
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }


        }

    }
}