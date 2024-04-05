package org.example;

public class Main {
    public static void main(String[] args) {

        Fibonacci fibonacci1 = new Fibonacci(10, 0, 1);
        Fibonacci fibonacci2 = new Fibonacci(15, 2, 4);

        Thread thread1 = new Thread(() -> {
            System.out.println("Thread 1 - Fibonacci-like sequence with starting numbers 0, 1:");
            fibonacci1.calculate();
        });

        Thread thread2 = new Thread(() -> {
            System.out.println("Thread 2 - Fibonacci-like sequence with starting numbers 2, 4:");
            fibonacci2.calculate();
        });

            thread1.start();
            thread2.start();

    }
}