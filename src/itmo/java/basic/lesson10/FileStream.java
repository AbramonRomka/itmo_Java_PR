package itmo.java.basic.lesson10;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileStream {
    static String chr;
    static String what;
    static String forWhat;

    public static void main(String[] args) throws FileNotFoundException {
        File file1 = new File("src/itmo/java/basic/lesson10/file.txt");
        File file2 = new File("src/itmo/java/basic/lesson10/file2.txt");
        File fileWrite = new File("src/itmo/java/basic/lesson10/newFile.txt");
        chr = "(?<=\\. )";                                                      //по какому символу переносим строку
        what = "[^а-я^a-z^0-9]";                                                //что меняем в тексте
        forWhat = "\\$";                                                        //на что меняем what в тексте

//      readText(file1, chr);                                                   //прочитали файл и разбили текст по символам chr и записали в лист
//      writeText(readText(file1,chr),fileWrite);                               //записали в файл, только один текст
//      writeText(readText(file1, chr), readText(file2, chr), fileWrite);       //записали в один файл оба текста
//      changeText(fileWrite, what, forWhat);                                   //перезаписали файл newFile изменив все символы на $
    }

    public static List<String> readText(File text, String chr) {
        String input;
        String output = "";
        try (BufferedReader read = new BufferedReader(new FileReader(text))) {
            while ((input = read.readLine()) != null) {
                output = output + input;
            }
        } catch (IOException e) {
            System.out.println("Файл не найден!");
        }
        String[] cut = output.split(chr);
        return new ArrayList<>(List.of(cut));
    }

    public static void writeText(List<String> list1, File fileWrite) {
        try (BufferedWriter write = new BufferedWriter(new FileWriter(fileWrite))) {
            for (String s : list1) {
                write.write(s);
                write.newLine();
            }
        } catch (IOException e) {
            System.out.println("Файл не найден!");
        }
    }

    public static void writeText(List<String> list1, List<String> list2, File fileWrite1) {
        list1.add("Склейка. Несколько цифр для проверки метода changeText: 15689785123...  45897!!! 46513223№;%:  56897№;%984613 1547485 13");
        list1.addAll(list2);
        writeText(list1, fileWrite1);

    }

    public static void changeText(File text, String what, String forWhat) {
        List<String> list = readText(text, chr);
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i).replaceAll(what, forWhat);
            list.set(i, str);
        }
        writeText(list, text);
    }
}
