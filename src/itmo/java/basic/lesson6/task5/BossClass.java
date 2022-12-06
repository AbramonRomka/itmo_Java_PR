package itmo.java.basic.lesson6.task5;

import java.util.Scanner;

public class BossClass {
    int age;
    Scanner console = new Scanner(System.in);

    public void info() {
        System.out.print("Введите возраст: ");
        this.age = console.nextInt();
        System.out.println("Возраст пользователя: " + age);
    }
}
