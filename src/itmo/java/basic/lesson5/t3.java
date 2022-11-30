package itmo.java.basic.lesson5;

import javax.crypto.SealedObject;
import java.util.Arrays;

import static java.lang.Boolean.valueOf;

public class t3 {
    public static void main(String[] args) {
        String longText = "Отчего грустит сейчас собака А её вчера назвали бякой А её вчера назвалибякой Хорошо- ли быть такой собакой Припев: Собака, говорю, не надо плакать, Говорю, не надо плакать Ты мой самый лучший друг Собака, говорю, не надо плакать, Говорю, не надо плакать Ты мой самый лучший друг Ну кому хвостом она помашет И кто слово доброе ей скажет Угостит кто косточкой собаку Кто теперь полюбит просто бякой";
        String searchWord = "бякой";
        String refactorWord = "[вырезано цензурой]";
        System.out.println(refactor(longText,refactorWord,searchWord));
    }

    public static String refactor(String longText, String refactorWord, String searchWord) {
        return longText.replaceAll(searchWord,refactorWord);
    }
}

