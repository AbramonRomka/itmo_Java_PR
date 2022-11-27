package itmo.java.basic.lesson5;

import java.io.StringBufferInputStream;
import java.sql.SQLOutput;
import java.util.Scanner;

public class t2 {
    public static void main(String[] args) {
        word();
    }
    public static boolean reverse (String wordIn){
        StringBuilder wordBuilder = new StringBuilder(wordIn);
        String wordRev = String.valueOf(wordBuilder.reverse());
        return wordIn.equals(wordRev);
    }
    public static void word (){
        Scanner console = new Scanner(System.in);
        System.out.print("Введите слово: ");
        String word = console.nextLine();
        System.out.println(word);
        print(reverse(word), word);
    }
    public static void print (boolean isPalindrome, String wordOut){
        if (isPalindrome){
            System.out.println("Слово \"" + wordOut + "\" является палиндромом.");
        }
        else System.out.println("Слово \"" + wordOut + "\" НЕ является палиндромом.");
    }
}
