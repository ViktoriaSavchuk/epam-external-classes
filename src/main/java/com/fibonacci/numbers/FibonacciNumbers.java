package com.fibonacci.numbers;

import java.util.Arrays;

public class FibonacciNumbers {

    public static void main(String[] args) {

        System.out.println(fibonacciNumber(11));
        System.out.println(fibonacciNumberRec(11));

        int array[]=fibonacciNumbersArray(11);
        System.out.println(Arrays.toString(array));
    }

    private static int[] fibonacciNumbersArray(int number) {
        int[] numbers = new int[number+1];
        numbers[0] = 0;
        numbers[1] = 1;

        for (int i = 2; i <= number; i++) {
            numbers[i] = numbers[i - 1] + numbers[i - 2];
        }
        return numbers;
    }

    private static int fibonacciNumberRec(int number) {

        if (fibonacciInputChecking(number) != 2) return fibonacciInputChecking(number);
        return fibonacciNumberRec(number - 1) + fibonacciNumberRec(number - 2);
    }

    private static int fibonacciNumber(int number) {

        if (fibonacciInputChecking(number) != 2) return fibonacciInputChecking(number);

        int[] numbers = new int[number+1];
        numbers[0] = 0;
        numbers[1] = 1;
        for (int i = 2; i < numbers.length; i++) {
            numbers[i] = numbers[i - 1] + numbers[i - 2];
        }
        return numbers[number];
    }

    private static int fibonacciInputChecking(int number) {
        if (number == 0) {
            return 0;
        } else if (number == 1) {
            return 1;
        } else if (number < 0) {
            throw new ArithmeticException("method for positive numbers only");
        }
        return 2;
    }
}
