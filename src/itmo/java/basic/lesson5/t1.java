package itmo.java.basic.lesson5;

public class t1 {
    public static void main(String[] args) {
        String longText = "Существуют две основные трактовки понятия «текст»: сущность как (расширенная, философски нагруженная) и репрезентативная (более частная). Имманентный подход подразумевает отношение к тексту как к автономной реальности, нацеленность на выявление его внутренней структуры. Репрезентативный — рассмотрение текста как особой формы представления информации о внешней тексту действительности.";
        System.out.println(trMethod(longText));
    }

    public static String trMethod(String lt) {
        String[] arrayText = lt.replaceAll("[^а-я^А-Я ^a-z^A-Z ]", "").split(" ");
        int l = 0;
        String str = null;
        for (String s : arrayText) {
            if (l <= s.length()) {
                l = s.length();
                str = s;
            }
        }
        return str;
    }
}
