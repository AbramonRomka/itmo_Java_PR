package itmo.java.basic.lesson4;

/*Напишите программу, которая выводит на консоль нечетные числа от 1 до 99.
Каждое число печатается с новой строки*/
public class t1 {
    public static void main(String[] args) {
        print();
    }

    private static void print() {
        for (int i = 1; i < 100; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
