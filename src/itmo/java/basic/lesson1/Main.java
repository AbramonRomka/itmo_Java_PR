package itmo.java.basic.lesson1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Я");
        System.out.println("хорошо");
        System.out.println("знаю");
        System.out.println("Java");

        //Задача 2
        System.out.println((46 + 10) * (10 / 3d));
        System.out.println(29 * 4 * (-15));

        //Задача 3
        double number = 10500;
        System.out.println((number / 10d) / 10d);

        //Задача 4
        double a = 3.6;
        double b = 4.1;
        double c = 5.9;
        System.out.println(a * b * c);

        //Задача 5
        Scanner console = new Scanner(System.in);
        int x = console.nextInt();
        int y = console.nextInt();
        int z = console.nextInt();

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);


        //Задача 6
        Scanner console1 = new Scanner(System.in);
        int n = console1.nextInt();
        if ((n % 2) == 0) {
            if (n > 100) {
                System.out.println("Выход за пределы диапазона");
            }
            System.out.println("Четное");
        } else {
            System.out.println("Нечетное");
        }
    }
}