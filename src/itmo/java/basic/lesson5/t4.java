package itmo.java.basic.lesson5;

import java.nio.file.attribute.UserPrincipalLookupService;
import java.util.Locale;

public class t4 {
    public static void main(String[] args) {
        String text = "Олень-северное животное.В летнее время животным в тайге жарко,а в горах даже в июле холодно.Олень как бы создан для северных просторов,жёсткого ветра,длинных морозных ночей.Олень легко бежит вперёд по тайге,подминает под себя кусты,переплывает быстрые реки.Олень не тонет,потому что каждая его шерстинка-это длинная трубочка,которую внутри наполняет воздух..Нос у оленя покрыт серебристой шёрсткой.Если бы шерсти на носу не было,олень бы его отморозил.";
        String search = "ОлЕнь";
        print(text,search);
    }
    public static void print(String text, String search){
        System.out.println((text.toLowerCase()).split((search.toLowerCase())).length - 1);
    }
}
