package com.javarush.task.task25.task2506;

public class LoggingStateThread extends Thread {
    Thread t = new Thread();

    public LoggingStateThread(Thread t) {
        this.t = t;
        setDaemon(true);
    }

    @Override
    public void run() {
        State state = this.t.getState();
        System.out.println(state);
        while(state!=State.TERMINATED){
            if(state!=this.t.getState()){
                state = this.t.getState();
                System.out.println(state);
            }
        }

    }
}
