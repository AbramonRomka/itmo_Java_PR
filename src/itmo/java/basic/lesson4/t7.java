package itmo.java.basic.lesson4;
/*Напишите программу, которая проверяет отсортирован ли массив по возрастанию.
Если он отсортирован по возрастанию то выводится “OK”, если нет,
то будет выводиться текст “Please, try again”*/
public class t7 {
    public static void main(String[] args) {
        int[] ints = new int[]{1, 2, 3, 5, 7, 8, 9, 90, 124, 536};
        if(sort(ints)){
            System.out.println("OK");
        }
        else System.out.println("PLease,try again");
    }

    static boolean sort(int[] in) {
        int m = 0;
        for (int j : in) {
            if (j >= m) {
                m = j;
            } else return false;
        }
        return true;
    }
}
