package itmo.java.basic.lesson5;

import java.util.Arrays;

import static java.lang.Boolean.valueOf;

public class t3 {
    public static void main(String[] args) {
        String longText = " Отчего грустит сейчас собака А её вчера назвали бякой А её вчера назвали бякой Хорошо- ли быть такой собакой Припев: Собака, говорю, не надо плакать, Говорю, не надо плакать Ты мой самый лучший друг Собака, говорю, не надо плакать, Говорю, не надо плакать Ты мой самый лучший друг Ну кому хвостом она помашет И кто слово доброе ей скажет Угостит кто косточкой собаку Кто теперь полюбит просто бяку";
        refactor(longText);

    }

    public static void refactor(String s) {
        String[] arrayText = s.split("(?=[А-Я])");
        String refactor = "";
        System.out.println("Стих до изменений:");
        print(arrayText);
        for (int i = 0; i < arrayText.length; i++) {
            String[] arrayWord = arrayText[i].split(" ");
            for (int j = 0; j < arrayWord.length; j++) {
                if (arrayWord[j].startsWith("бяк")) {
                    arrayWord[j] = "[вырезано цензурой]";
                }
                refactor = refactor + arrayWord[j] + " ";
            }
            arrayText[i] = refactor;
            refactor = "";
        }
        System.out.println("Стих после изменений:");
        print(arrayText);
    }

    public static void print(String[] print) {
        for (String m : print) {
            System.out.println(m);
        }
        System.out.println("");
    }
}

