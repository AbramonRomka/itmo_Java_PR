package itmo.java.basic.lesson4;
/*Напишите программу, чтобы проверить, что массив содержит число 1 или 3*/
import javax.xml.stream.events.DTD;

public class t6 {
    public static void main(String[] args) {
        int[] ints = new int[]{2, 4, 6, 1, 5, 3, 7, 8};
        System.out.println(task6(ints));

    }
    public static String task6 (int[] array){
        for (int i = 0; i < 7; i++) {
        if (array[i] == 1 || array[i] == 3) {
            return "Массив содержит 1 или 3";
        }
    }
        return "Массив НЕ содержит 1 или 3";
    }
}
