package itmo.java.basic.lesson6.task1_2;

public class Client extends Human implements City {
    String bankName;
    String city;

    @Override
    public void showInfo() {
        if (city.isEmpty())
            System.out.println(name + " " + surname + " клиент " + bankName + " банка.");
        else
        System.out.println(name + " " + surname + " клиент " + bankName + " банка, проживающий в городе " + city);
    }

    public Client(String name, String surname, String bankName) {
        super(name, surname);
        this.bankName = bankName;
    }

    @Override
    public void setCity(String city) {
        this.city = city;
    }
}
