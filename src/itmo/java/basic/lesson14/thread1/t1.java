package itmo.java.basic.lesson14.thread1;
/* Напишите программу, в которой запускается 10 потоков и каждый из них выводит
        числа от 0 до 100.
   Выведете состояние потока, перед его запуском, после запуска и во время
        выполнения.*/

class Stream extends Thread {
    Stream(int id) {
        super("Stream " + id + ": ");
    }

    public void run() {
        for (int i = 0; i < 101; i++) {
            System.out.println(getName() + " " + i);
        }

    }
}

class StreamStarter {
    public static void main(String[] args) {
        int amount = 11; //количество необходимых потоков
        duringState(start(amount), amount);
    }

    public static Stream[] start(int amount) {
        Stream[] stream = new Stream[amount];
        for (int i = 0; i < amount; i++) {
            stream[i] = new Stream(i);
            System.out.println(stream[i].getName() + " " + stream[i].getState());
            stream[i].start();
            System.out.println(stream[i].getName() + " " + stream[i].getState());
        }
        return stream;
    }

    public static void duringState(Stream[] stream, int amount) {
        //статус потоков выводится до тех пор, пока все потоки не будут TERMINATED.
        int n = 0;
        while (n < amount) {
            for (Stream value : stream) {
                System.out.println(value.getName() + " " + value.getState());
            }
            //проверка потоков на статус TERMINATED
            for (Stream value : stream) {
                if (value.getState() == Thread.State.TERMINATED) {
                    n++;
                }
                else n = 0;
            }
        }
    }
}