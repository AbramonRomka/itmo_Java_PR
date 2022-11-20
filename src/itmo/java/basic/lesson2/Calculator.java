package itmo.java.basic.lesson2;

public class Calculator {
    public static void main(String[] args){
        long a = 2;
        long b = 3;
        Calculator calc = new Calculator();

        System.out.println(calc.division(a,b));
    }
    int addition(int a, int b) {
        return (a+b);

    }
    double addition(double a, double b) {
        return (a+b);
    }
    long addition(long a, long b) {
        return (a+b);
    }

    int subtraction(int a, int b) {
        return (a-b);
    }
    double subtraction(double a, double b) {
        return (a-b);
    }
    long subtraction(long a, long b) {
        return (a-b);
    }

    double division(int a, int b) {
        return (double) a/b;
    }
    double division(double a, double b) {
        return (a/b);
    }
    double division(long a, long b) {
        return (double) a/b;
    }

    int multiplication(int a, int b) {
        return (a*b);
    }
    double multiplication(double a, double b) {
        return (a*b);
    }
    long multiplication(long a, long b) {
        return (a*b);
    }
}
