package com.javarush.task.task25.task2512;

import java.util.ArrayList;
import java.util.List;

/*
Живем своим умом
*/
public class Solution implements Thread.UncaughtExceptionHandler {

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        t.interrupt();
        List<Throwable> list = new ArrayList<>();
        list.add(e);
        Throwable throwable = e.getCause();
        while (throwable!=null){
            list.add(0,throwable);
            throwable = throwable.getCause();
        }
        for(Throwable throvvv: list){
            System.out.println(throvvv.getClass().getName()+ ": " + throvvv.getMessage());
        }
    }

    public static void main(String[] args) {

    }
}
