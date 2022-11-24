package itmo.java.basic.lesson4;

import java.util.Scanner;
/*Напишите программу, чтобы вычислить сумму двух целых чисел и вернуть true,
если сумма равна третьему целому числу*/
public class t3 {

    public static void main(String[] args) {
        System.out.println(task3());
    }
    public static boolean task3 (){
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
        return (boolean) (number1 + number2 == number3);

    }
}
