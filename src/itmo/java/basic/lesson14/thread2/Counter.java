package itmo.java.basic.lesson14.thread2;

public class Counter {
    static int count = 0;

    public static synchronized void increment() {

        count = count + 1;
    }

    public static int getCount() {
        return count;

    }
}

class HundredThread {
    public static int amountAdditions;
    public static int amount;

    public static void main(String[] args) {
        amount = 100;
        amountAdditions = 1000;
        threadCreate();
    }

    public static void threadCreate() {
        for (int i = 0; i < amount; i++) {
            ThreadStart thread = new ThreadStart();
            thread.start();
        }
    }
}

class ThreadStart extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < HundredThread.amountAdditions; i++) {
            Counter.increment();
            System.out.println(Counter.getCount());
        }
    }
}