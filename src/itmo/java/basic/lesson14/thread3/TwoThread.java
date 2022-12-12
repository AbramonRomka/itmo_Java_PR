package itmo.java.basic.lesson14.thread3;

public class TwoThread {

    public static void main(String[] args) {
        Object object = new Object();
        One one = new One(object);
        Two two = new Two(object);
        new Thread(one).start();
        new Thread(two).start();
    }
}

class Object {
    private boolean flag = true;

    public synchronized void get() {
        while (flag) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        flag = !flag;
        System.out.println("two");
        notify();
    }

    public synchronized void put() {
        while (!flag) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        flag = !flag;
        System.out.println("one");
        notify();
    }
}

class One implements Runnable {

    Object object;

    One(Object object) {
        this.object = object;
    }

    public void run() {
        while (true) {
            object.put();
        }
    }
}

class Two implements Runnable {

    Object object;

    Two(Object object) {
        this.object = object;
    }

    public void run() {
        while (true) {
            object.get();
        }
    }
}