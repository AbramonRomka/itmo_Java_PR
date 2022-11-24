package itmo.java.basic.lesson4;
/*Напишите программу, которая считывает с клавиатуры длину массива (например, пользователь вводит цифру 4),
затем пользователь вводит 4 числа и на новой строке выводится массив из 4 элементов*/
import java.util.Arrays;
import java.util.Scanner;

public class t8 {
    public static void main(String[] args) {
        print(input());
    }
    public static int[] input(){
        Scanner console = new Scanner(System.in);
        System.out.print("Array lenght: ");
        int l = console.nextInt();
        int[] ints = new int[l];
        System.out.println("Numbers of array: ");
        for(int i = 0; i<ints.length; i++){
            ints[i] = console.nextInt();
        }
        return ints;
    }
    public static void print(int [] array){
        System.out.print("Result: " + Arrays.toString(array));
    }
}
