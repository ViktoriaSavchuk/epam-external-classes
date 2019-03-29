package com.sort;

import java.math.BigInteger;
import java.util.Arrays;

public class FibonacciBigInteger {

    private static BigInteger[] fibonacciNumbers(int number) {
        BigInteger[] numbers = new BigInteger[number+1];
        numbers[0] = BigInteger.valueOf(0);
        numbers[1] = BigInteger.valueOf(1);

        for (int i = 2; i < numbers.length; i++) {
            numbers[i] = numbers[i - 1].add(numbers[i - 2]);
        }
        return numbers;
    }

    private static BigInteger fibonacciNumber(int number){
        if(number==0){
            return BigInteger.valueOf(0);
        }else if (number==1){
            return BigInteger.valueOf(1);
        }
        return fibonacciNumber(number-1).add(fibonacciNumber(number-2));
    }

    public static void main(String[] args) {

        BigInteger[] fibonacciNumbers = fibonacciNumbers(20);
        System.out.println(Arrays.toString(fibonacciNumbers));

        BigInteger fibonacciNumber=fibonacciNumber(20);
        System.out.println(fibonacciNumber);
    }
}
