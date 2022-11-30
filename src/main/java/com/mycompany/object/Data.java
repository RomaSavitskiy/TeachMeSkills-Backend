package com.mycompany.object;

public class Data {
    private String packet;
    private boolean transfer = true;

    // synchronized отвечает за то, что этот метод одновременно может обрабатывать только один поток
    // notifyAll отвечает за то, что класс доступен для потоков
    // wait означает, что потоки не могут некоторое время работать с этим классом
    public synchronized String receive() throws InterruptedException {
        while (transfer) {
            wait();
        }

        transfer = true;
        String returnPacket = packet;
        notifyAll();
        return returnPacket;
    }

    public synchronized void send(String packet) throws InterruptedException {
        while (!transfer) {
            wait();
        }

        transfer = false;
        this.packet = packet;
        notifyAll();
    }

}
