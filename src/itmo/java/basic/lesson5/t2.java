package itmo.java.basic.lesson5;

import java.util.Scanner;

public class t2 {
    public static void main(String[] args) {

        if (reverse(word())) System.out.println("Слово является палиндромом.");
        else System.out.println("Слово не является палиндромом.");
    }

    public static boolean reverse(String word) {
        StringBuilder wordBuilder = new StringBuilder(word);
        String wordRev = String.valueOf(wordBuilder.reverse());
        return word.equalsIgnoreCase(wordRev);
    }

    public static String word() {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите слово: ");
        return console.nextLine();
    }
}
