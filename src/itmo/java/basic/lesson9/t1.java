package itmo.java.basic.lesson9;

import java.util.*;

public class t1 {
    static Collection<String> collection = List.of(
            "gg",
            "g1",
            "g2",
            "g3",
            "g1",
            "g4",
            "g5",
            "g7",
            "g1",
            "g6",
            "g3",
            "g3",
            "g1",
            "g5",
            "g8"
    );
    public static Set<String> returnList(Collection<String> List){
        Set<String> set = new HashSet<>(List);
        return set;
    }

    public static void main(String[] args) {
        System.out.println(collection);
        System.out.println(returnList(collection));
    }
}
