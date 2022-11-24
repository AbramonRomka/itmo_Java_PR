package itmo.java.basic.lesson4;

import java.util.Scanner;

public class t4 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите 1 число: ");
        int number1 = console.nextInt();
        System.out.println(" ");
        System.out.print("Введите 2 число: ");
        int number2 = console.nextInt();
        System.out.println(" ");
        System.out.print("Введите 3 число: ");
        int number3 = console.nextInt();
        System.out.println(" ");
        System.out.println((boolean) (number1 < number2 && number2 < number3));
    }

}
