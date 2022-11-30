package com.mycompany.object;

import lombok.AllArgsConstructor;
import lombok.SneakyThrows;

import java.util.concurrent.ThreadLocalRandom;

@AllArgsConstructor
public class Sender implements Runnable {
    public static final String[] PACKETS = new String[] {
            "First packet", "Second packet", "Third packet", "Fourth packet", "End"};

    private Data data;

   @SneakyThrows
    public void run() {
        for (String packet : PACKETS) {
            data.send(packet);
            try {
                Thread.sleep(ThreadLocalRandom.current().nextInt(1000, 5000));
            } catch (InterruptedException e) {

            }
        }
    }
}
