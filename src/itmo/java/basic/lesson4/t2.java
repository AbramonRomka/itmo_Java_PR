package itmo.java.basic.lesson4;
/*Напишите программу, которая выводит числа от 1 до 100,
которые делятся на 3, 5 и на то и другое (то есть и на 3 и на 5).*/
public class t2 {
    public static void main(String[] args) {
        System.out.print("Делится на 3:");
        for (int i = 0; i<101; i++){
            if(i%3 == 0) System.out.print(i + ", ");
        }
        System.out.println(" ");
        System.out.print("Делится на 5:");
        for (int i = 0; i<101; i++){
            if(i%5 == 0) System.out.print(i + ", ");
        }
        System.out.println(" ");
        System.out.print("Делится на 3 и на 5:");
        for (int i = 0; i<101; i++){
            if(i%3 == 0 && i%5 == 0) System.out.print(i + ", ");
        }
    }
}
