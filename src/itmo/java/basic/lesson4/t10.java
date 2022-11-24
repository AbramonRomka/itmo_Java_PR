package itmo.java.basic.lesson4;
/*Дан массив чисел. Найдите первое уникальное в этом массиве число*/
import java.util.Arrays;

public class t10 {
    public static void main(String[] args) {
        int[] ints = new int[]{6, 8, 9, 122, 3, 6, 8, 8, 4, 21, 4, 23, 5, 21, 5, 6, 4, 3, 9};
        print(sorted(ints));
    }
    public static void print(int[] sear){

        for (int x = 0; x < sear.length - 1; x++) {
            if (x == 0) {
                if (sear[x] != sear[x + 1]) {
                    System.out.println(sear[x]);
                    break;
                } else continue;
            } else if (sear[x] != sear[x - 1] && sear[x] != sear[x + 1]) {
                System.out.println(sear[x]);
                break;
            } else if (x == sear.length - 2 && sear[x] != sear[sear.length - 1]) {
                System.out.println(sear[x + 1]);
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
