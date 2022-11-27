package itmo.java.basic.lesson5;

public class t1 {
    public static void main(String[] args) {
        String longText = "Существуют две основные трактовки понятия «текст»: имманентная (расширенная, философски нагруженная) и репрезентативная (более частная). Имманентный подход подразумевает отношение к тексту как к автономной реальности, нацеленность на выявление его внутренней структуры. Репрезентативный — рассмотрение текста как особой формы представления информации о внешней тексту действительности.";
        print(trMethod(longText));
    }

    public static String trMethod(String lt) {
        String[] arrayText = lt.split("[., ()]");
        int l = 0;
        String str = null;
        for (String s : arrayText) {
            if (l <= s.length()) {
                str = s;
            }
        }
        return str;
    }

    public static void print(String word) {

        System.out.print("Слово: ");
        System.out.println(word);
        System.out.print("Длинна слова: ");
        System.out.println(word.length());
    }
}
