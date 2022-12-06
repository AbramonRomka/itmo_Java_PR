package itmo.java.basic.lesson6.task5;

public class ExtendedClass extends BossClass {
    String name;

    public void info() {
        System.out.print("Введите имя: ");
        this.name = console.nextLine();
        System.out.println("Имя пользователя: " + name);
    }
}
