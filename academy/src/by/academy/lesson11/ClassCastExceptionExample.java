package by.academy.lesson11;

public class ClassCastExceptionExample {
    public static void main(String[] args) {
        method(new int[0]);
    }

    private static void method(Object arg) {
        String x = (String) arg;
    }
}