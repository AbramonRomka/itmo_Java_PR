package itmo.java.basic.lesson6.task3;
public class Truck extends Car{
    int amountWheels;
    int maxWeight;
    public void newWheels(int amountWheels){
        this.amountWheels = amountWheels;
        System.out.println("Количество колёс: " + amountWheels);
    }
    public Truck(int weight, String model, char color, float speed, int amountWheels, int maxWeight){
        this.weight = weight;
        this.model = model;
        this.color = color;
        this.speed = speed;
        this.amountWheels = amountWheels;
        this.maxWeight = maxWeight;
    }
}
