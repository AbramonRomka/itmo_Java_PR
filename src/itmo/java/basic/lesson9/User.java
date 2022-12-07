package itmo.java.basic.lesson9;

import java.util.*;

public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName(String bob) {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    static Map<User, Integer> numberPoints = Map.of(
            new User("Jack"), 5,
            new User("Nick"), 6,
            new User("Anny"), 7,
            new User("Artur"), 8,
            new User("Roman"), 9,
            new User("Anton"), 10,
            new User("Jessy"), 11,
            new User("Sam"), 12,
            new User("Bob"), 10,
            new User("Kate"), 11
    );

    private static List<Integer> searchMap(Map<User, Integer> numberPoints, String input) {
        List<Integer> point = new ArrayList<>();
        for (Map.Entry<User, Integer> pair : numberPoints.entrySet()) {
            User key = pair.getKey();
            Integer val = pair.getValue();
            if (input.equals(key.getName("Bob"))) {
                point.add(val);
            }
        }
        return point;
    }

    public static String input() {
        Scanner console = new Scanner(System.in);
        return console.nextLine();
    }

    public static void main(String[] args) {
        System.out.println(searchMap(numberPoints, input()));
    }
}
