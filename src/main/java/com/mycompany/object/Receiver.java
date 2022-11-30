package com.mycompany.object;

import lombok.AllArgsConstructor;
import lombok.SneakyThrows;

import java.util.concurrent.ThreadLocalRandom;

@AllArgsConstructor
public class Receiver implements Runnable {
    private Data load;

    @SneakyThrows
    public void run() {
            for(String receivedMessage = load.receive();
            !"End".equals(receivedMessage);
            receivedMessage = load.receive()) {
                System.out.println(receivedMessage);
            }

            try {
                Thread.sleep((ThreadLocalRandom.current().nextInt(1000, 5000)));
            } catch (InterruptedException e) {
            }
    }
}
