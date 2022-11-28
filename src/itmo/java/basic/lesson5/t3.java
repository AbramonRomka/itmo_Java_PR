package itmo.java.basic.lesson5;

import java.util.Arrays;

import static java.lang.Boolean.valueOf;

public class t3 {
    public static void main(String[] args) {
        String longText = " Отчего грустит сейчас собака А её вчера назвали бякой А её вчера назвали бякой Хорошо- ли быть такой собакой Припев: Собака, говорю, не надо плакать, Говорю, не надо плакать Ты мой самый лучший друг Собака, говорю, не надо плакать, Говорю, не надо плакать Ты мой самый лучший друг Ну кому хвостом она помашет И кто слово доброе ей скажет Угостит кто косточкой собаку Кто теперь полюбит просто бяку";
        String refactorWord = "[вырезано цензурой]";
        for (String m : refactor(longText, refactorWord)) {
            System.out.println(m);
        }
        System.out.println("");
    }

    public static String[] refactor(String Word, String refactorWord) {
        String[] arrayText = Word.split("(?=[А-Я])");
        String refactor = "";
        for (int i = 0; i < arrayText.length; i++) {
            String[] arrayWord = arrayText[i].split(" ");
            for (int j = 0; j < arrayWord.length; j++) {
                if (arrayWord[j].contains("бяк")) {
                    arrayWord[j] = refactorWord;
                }
                refactor = refactor + arrayWord[j] + " ";
            }
            arrayText[i] = refactor;
            refactor = "";
        }
        return arrayText;
    }
}

