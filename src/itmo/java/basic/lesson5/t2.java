package itmo.java.basic.lesson5;

import java.util.Scanner;

public class t2 {
    public static void main(String[] args) {
        if (word()){
            System.out.println("Слово является палиндромом.");
        }
        else System.out.println("Слово НЕ является палиндромом.");
    }
    public static boolean reverse (String wordIn, String word){
        StringBuilder wordBuilder = new StringBuilder(wordIn);
        String wordRev = String.valueOf(wordBuilder.reverse());
        return wordIn.equals(wordRev);
    }
    public static boolean word (){
        Scanner console = new Scanner(System.in);
        System.out.print("Введите слово: ");
        String word = (console.nextLine()).toLowerCase();
        System.out.println(word);
        return reverse((word), word);
    }
}
