package itmo.java.basic.lesson4;

import java.util.Arrays;

public class t10 {
    public static void main(String[] args) {
        int[] ints = new int[]{6, 8, 9, 122, 3, 6, 8, 8, 4, 21, 4, 23, 5, 21, 5, 6, 4, 3, 9};
        System.out.println(Arrays.toString(ints));
        sorted(ints);
        System.out.println(Arrays.toString(ints));
        for (int x = 0; x < ints.length - 1; x++) {
//            System.out.println(x);
//            System.out.println(x != ints[ints.length-2]);
            if (x == 0) {
                if (ints[x] != ints[x + 1]) {
                    System.out.println(ints[x]);
                    break;
                } else continue;
            } else if (ints[x] != ints[x - 1] && ints[x] != ints[x + 1]) {
                System.out.println(ints[x]);
                break;
            } else if (x == ints.length - 2 && ints[x] != ints[ints.length - 1]) {
                System.out.println(ints[x + 1]);
                break;
            }
        }
    }

    public static int[] sorted(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[j] > array[i]) {
                    int m = array[j];
                    array[j] = array[i];
                    array[i] = m;
                }
            }
        }
        return array;
    }
}
