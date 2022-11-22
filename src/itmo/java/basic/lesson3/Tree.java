package itmo.java.basic.lesson3;

public class Tree {
    int age;
    boolean living;
    String name;

    public Tree(int age, String name){
        this.age = age;
        this.name = name;
    }
    public Tree(int age, boolean living, String name){
        this.age = age;
        this.living = living;
        this.name = name;
    }
    public Tree(){
        System.out.println("Пустой конструктор без параметров сработал");
    }

    public static void main(String[] args) {
        Tree t1 = new Tree(94, "Ильич");
        Tree t2 = new Tree(15, true, "Дарья");
        Tree t3 = new Tree();

        System.out.println("Имя дерева: " + t2.name + " /Возраст: " + t2.age + " /Живое?: " + t2.living);
        System.out.println("Имя дерева: " + t1.name + " /Возраст: " + t1.age);
    }
}