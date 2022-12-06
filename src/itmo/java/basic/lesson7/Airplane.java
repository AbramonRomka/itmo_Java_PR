package itmo.java.basic.lesson7;

public class Airplane {
    public static class Wing {
        int weight;

        public Wing(int weight) {
            this.weight = weight;
        }

        void getInfo() {
            System.out.println("Вес крыла: " + weight + "кг.");
        }

    }

    public static void main(String[] args) {
        Wing airBus = new Wing(3500);
        Wing superJet = new Wing(1800);
        airBus.getInfo();
        superJet.getInfo();
    }

}
