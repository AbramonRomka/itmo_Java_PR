package itmo.java.basic.lesson3;

public class Car {
    private String color;
    private String model;
    private int weight;

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

    public String getColor(String color){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }

    public String getModel(String model){
        return model;
    }
    public  void setModel(String model){
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        car1.setColor("Красный");
        car1.setModel("BMW");
        car1.setWeight(1200);

        car2.setColor("Белый");
        car2.setModel("Mercedes");
        car2.setWeight(1600);

        car1.print(car1.color, car1.model, car1.weight);
        car2.print(car2.color, car2.model, car2.weight);
    }
}