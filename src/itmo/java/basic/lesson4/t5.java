package itmo.java.basic.lesson4;
/*Напишите программу, чтобы проверить,
появляется ли число 3 как первый или последний элемент массива целых чисел.
Длина массива должна быть больше или равна двум*/
public class t5 {
    public static void main(String[] args) {
        int[] ints = new int[]{3, 4, 6, 1, 5, 3, 7, 8};
        System.out.print("array = ");
        for (int anInt : ints) {
            System.out.print(anInt + ", ");
        }
        System.out.println("");
        System.out.print(ints.length >= 2 && ints[ints.length-1] == 3 || ints[0] == 3);
    }
}
