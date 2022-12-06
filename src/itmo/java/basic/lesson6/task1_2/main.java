package itmo.java.basic.lesson6.task1_2;

public class main {
    public static void main(String[] args) {
        Client clien1 = new Client("Алешка", "Попович", "Русич");
        EmployeeBank employee1 = new EmployeeBank("Аркадий", "Михалыч", "Альфа");
        clien1.setCity("Киев");
        employee1.setCity("Москва");
        clien1.showInfo();
        employee1.showInfo();
    }
}
