package itmo.java.basic.lesson3;

public class Home {
    int floor;
    int years;
    String name;

    public Home(int floor, int years, String name) {
        this.floor = floor;
        this.years = years;
        this.name = name;
    }

    int age() {
        return 2022 - years;
    }


    public static void main(String[] args) {
        Home home1 = new Home(5, 1863, "Дом Ильиных");
        Home home2 = new Home(15, 2018, "ЖК Янино");
        System.out.println("Имя здания: " + home1.name + " /Этажей: " + home1.floor + " /Возраст здания:" + home1.age());
        System.out.println("Имя здания: " + home2.name + " /Этажей: " + home2.floor + " /Возраст здания:" + home2.age());
    }

}