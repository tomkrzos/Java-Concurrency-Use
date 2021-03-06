package com.java.task5.nonblocking;

import com.java.utils.SysUtil;

import java.util.concurrent.ConcurrentLinkedQueue;

public class ProducerNoBlocking1 implements Runnable {

    private ConcurrentLinkedQueue<String> queue;
    private int counter = 0;

    public ProducerNoBlocking1(ConcurrentLinkedQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        System.out.println("ProducerNoBlocking1 Started 1");
        while (true) {
            SysUtil.sleepRandom(1, 5);
            String elem = "Product" + counter;
            queue.add(elem);
            System.out.println("Producer1: " + elem + " constructed");
            counter++;
        }
    }
}
