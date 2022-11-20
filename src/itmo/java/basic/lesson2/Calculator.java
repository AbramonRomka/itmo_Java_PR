package itmo.java.basic.lesson2;

public class Calculator {
    public static void main(String[] args){
        double a = 2.0;
        double b = 3.4;
        Calculator calc = new Calculator();

        System.out.println(calc.multiplication(a,b));
    }
    int addition(int a, int b) {
        int c = a+b;
        return c;
    }
    double addition(double a, double b) {
        double c = a+b;
        return c;
    }
    long addition(long a, long b) {
        long c = a+b;
        return c;
    }

    int subtraction(int a, int b) {
        int c = a-b;
        return c;
    }
    double subtraction(double a, double b) {
        double c = a-b;
        return c;
    }
    long subtraction(long a, long b) {
        long c = a-b;
        return c;
    }

    int division(int a, int b) {
        int c = a/b;
        return c;
    }
    double division(double a, double b) {
        double c = a/b;
        return c;
    }
    long division(long a, long b) {
        long c = a/b;
        return c;
    }

    int multiplication(int a, int b) {
        int c = a*b;
        return c;
    }
    double multiplication(double a, double b) {
        double c = a*b;
        return c;
    }
    long multiplication(long a, long b) {
        long c = a*b;
        return c;
    }
}
