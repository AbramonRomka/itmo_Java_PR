package itmo.java.basic.lesson5;

public class t5 {
    public static void main(String[] args) {
        String str = "This is a test string";
        print(str);
    }
    public static String inverted (String str){
        StringBuilder out = new StringBuilder();
        String[] s = str.split("(\\b)");
        for (int i = 0; i < s.length; i++) {
            StringBuilder strBuild = new StringBuilder(s[i]);
            s[i] = String.valueOf(strBuild.reverse());
            out.append(s[i]);
        }
        return out.toString();
    }
    public static void print (String str){
        System.out.print("Строка до инверсии: ");
        System.out.println(str);
        System.out.print("Строка после инверсии: ");
        System.out.println(inverted(str));
    }
}
