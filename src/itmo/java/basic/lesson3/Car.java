package itmo.java.basic.lesson3;

public class Car {
    String color;
    String model;
    int weight;

    void print(String color, String model, int weight) {
        System.out.println("Цвет: " + color + " Модель: " + model + " Вес: " + weight);
    }

    public Car(String color) {
        this.color = color;
    }

    public Car(String color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    public Car() {

    }


    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        car1.color = "Красный";
        car1.model = "BMW";
        car1.weight = 1200;

        car2.color = "Белый";
        car2.model = "Mercedes";
        car2.weight = 1600;

        car1.print(car1.color, car1.model, car1.weight);
        car2.print(car2.color, car2.model, car2.weight);
    }
}