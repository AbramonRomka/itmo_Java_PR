package itmo.java.basic.lesson4;
/*Напишите программу, чтобы проверить,
появляется ли число 3 как первый или последний элемент массива целых чисел.
Длина массива должна быть больше или равна двум*/
public class t5 {
    public static void main(String[] args) {
        int[] ints = new int[]{3, 4, 6, 1, 5, 3, 7, 8};
        print(ints);
        System.out.println("");
        System.out.print(task6(ints));
    }
    public static boolean task6(int[] array){
        return array[array.length-1] == 3 || array[0] == 3;
    }
    public static void print(int[] array){
        System.out.print("array = ");
        for (int anInt : array) {
            System.out.print(anInt + ", ");
        }

    }
}
