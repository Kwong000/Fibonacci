package org.example;

public class Fibonacci implements FibonacciLike {

    private int amountofNumbersInSequence;
    private int number1;
    private int number2;


    public Fibonacci(int amountofNumbersInSequence, int number1, int number2) {
        this.amountofNumbersInSequence = amountofNumbersInSequence;
        this.number1 = number1;
        this.number2 = number2;
    }

    public void calculate() {
        int a = number1;
        int b = number2;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < amountofNumbersInSequence; i++) {
            int temp = a + b;
            System.out.print(temp + " ");
            a = b;
            b = temp;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
