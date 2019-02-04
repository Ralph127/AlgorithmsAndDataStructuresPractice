package com.company.PracticeProblems;

public class FactorialWithRecursion {

    public static void main(String[] args) {
        int num = 5;

        System.out.println(recursiveFactorial(num));
    }

    // 1! = 1 * 0! = 1
    // 2! = 2 * 1 = 2 * 1!
    // 3! = 3 * 2 * 1 = 3 * 2!

    // n! = n * (n - 1)!

    public static int recursiveFactorial(int num) {

        if(num ==0) {
            return 1;
        }

        return num * recursiveFactorial(num -1);
    }

    // regular factorial
    public static int iterativeFactorial(int num) {

        if(num == 0) {
            return 1;
        }
        // always start factorial at 1
        int factorial = 1;
        for(int i = 1; i <= num; i++) {
            factorial *= i;
        }

        return factorial;
    }
}
