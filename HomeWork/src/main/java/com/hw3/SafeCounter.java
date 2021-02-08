package com.hw3;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import static java.lang.Thread.sleep;

public class SafeCounter {
    public static int counter;
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();

        SafeCounter safeCounter = new SafeCounter();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        lock.lock();
                        System.out.println(counter);
                        counter++;
                        sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } finally {
                        lock.unlock();
                    }
                }
            }
        });

        t1.start();
    }
}
