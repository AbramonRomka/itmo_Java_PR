package itmo.java.basic.lesson4;

import java.util.Arrays;

public class t9 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 3, 5, 6, 8, 7, 52, 67, 9, 8, 22};
        System.out.print("Array 1: ");
        System.out.println(Arrays.toString(array));
        int a1 = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = a1;
        System.out.print("Array 2: ");
        System.out.println(Arrays.toString(array));
    }
}
