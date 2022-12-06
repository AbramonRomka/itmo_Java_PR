package itmo.java.basic.lesson6.task1_2;

abstract public class Human {
    String name, surname;

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public abstract void showInfo();

    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
}
