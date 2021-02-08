package com.hw3;

import static java.lang.Thread.sleep;

public class PingPong {
    private final Object monitor = new Object();
    private boolean printPing = true;
    private boolean printPong = true;

    public static void main(String[] args) {
        PingPong main = new PingPong();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    main.printPing();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    main.printPong();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        t2.start();
    }

    private void printPing() throws InterruptedException {
        synchronized (monitor) {
            while (true) {
                if(!printPing){
                    monitor.wait();
                }

                System.out.println("Ping");
                sleep(1000);

                printPing = false;
                printPong = true;

                monitor.notify();

                monitor.wait();
            }
        }
    }

    private void printPong() throws InterruptedException {
        synchronized (monitor) {
            while(true) {
                if(printPing){
                    monitor.wait();
                }

                System.out.println("Pong");
                sleep(1000);

                printPong = false;
                printPing = true;

                monitor.notify();

                monitor.wait();
            }
        }
    }
}

