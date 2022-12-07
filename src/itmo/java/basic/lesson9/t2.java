package itmo.java.basic.lesson9;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class t2 {
    static List<Integer> millionArray = new ArrayList<>();
    static List<Integer> millionLinked = new LinkedList<>();

    public static void addMillion(List<Integer> millionArray, List<Integer> millionLinked) {
        for (int i = 0; i < 1000000; i++) {
            millionLinked.add(i);
            millionArray.add(i);
        }
    }

    public static double timer(List<Integer> timerList) {
        long timeStart = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            timerList.get(i);
        }
        return (double) (System.nanoTime() - timeStart) / 1e+9;
    }

    public static void main(String[] args) {
        addMillion(millionArray,millionLinked);
        System.out.println(timer(millionArray) + " секунд");
        System.out.println(timer(millionLinked) + " секунд");
//        Причина такой разницы во времени в том, что LinkedList`у приходится
//          каждый раз начинать поиск элемента с 1, потому что только 1 элемент знает,
//          что есть 2, 2 знает о 3 и так далее.
//        В то время как ArrayList сразу обращается к нужному индексу,
//           потому что Array это всё таки массив в котором каждый элемент имеет индекс,
//           а Linked некая цепочка элементов без индексов.
    }
}
