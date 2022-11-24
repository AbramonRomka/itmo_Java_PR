package itmo.java.basic.lesson4;

import javax.xml.stream.events.DTD;

public class t6 {
    public static void main(String[] args) {
        int[] ints = new int[]{2, 4, 6, 1, 5, 3, 7, 8};
        for (int i = 0; i < 7; i++) {
            if (ints[i] == 1 || ints[i] == 3) {
                System.out.println("Массив содержит 1 или 3");
                break;
            }
        }
    }
}
