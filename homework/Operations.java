package homework;

public class Operations {
    public static int plus(int numberOne, int numberTwo) {
        return numberOne + numberTwo;
    }

    public static int minus(int numberOne, int numberTwo) {
        return numberOne - numberTwo;
    }

    public static int ymn(int numberOne, int numberTwo) {
        return numberOne * numberTwo;
    }

    public static int del(int numberOne, int numberTwo) {
        return numberOne / numberTwo;
    }

    public static int fact(int numberOne) {
        int res = 1;
        for (int i = 1; i < numberOne; i++) {
            res *= i;
        }
        return res;
    }
}