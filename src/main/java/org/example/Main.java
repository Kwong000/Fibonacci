package org.example;

public class Main {
    public static void main(String[] args) {

        Fibonacci fibonacci1 = new Fibonacci(10, 0, 1);
        Fibonacci fibonacci2 = new Fibonacci(15, 2, 4);

        Thread thread1 = new Thread(fibonacci1);

        Thread thread2 = new Thread(fibonacci2);

            thread1.start();
            thread2.start();

    }
}