package itmo.java.basic.lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class t8 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Array lenght: ");
        int l = console.nextInt();
        int[] ints = new int[l];
        System.out.println("Numbers of array: ");
        for(int i = 0; i<ints.length; i++){
            ints[i] = console.nextInt();
        }
        System.out.print("Result: " + Arrays.toString(ints));
    }
}
