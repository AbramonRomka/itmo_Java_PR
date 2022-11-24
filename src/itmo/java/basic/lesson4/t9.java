package itmo.java.basic.lesson4;
/*Напишите метод, который меняет местами первый и последний элемент массива.*/
import java.util.Arrays;

public class t9 {
    public static void main(String[] args) {
        int[] array = new int[]{6, 3, 5, 6, 8, 7, 52, 67, 9, 8, 22};
        print(array);
    }
    public static int[] replacement(int[] ints){
        int a1 = ints[0];
        ints[0] = ints[ints.length - 1];
        ints[ints.length - 1] = a1;
        return ints;
    }
    public static void print(int[] pri){
        System.out.print("Array 1: ");
        System.out.println(Arrays.toString(pri));
        System.out.print("Array 2: ");
        System.out.println(Arrays.toString(replacement(pri)));
    }
}
