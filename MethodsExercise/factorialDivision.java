package MethodsExercise;

import java.util.Scanner;

public class factorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        long fact1 = printFactorial1(num1);
        long fact2 = printFactorial2(num2);

        double result = fact1 * 1.00 / fact2;
        System.out.printf("%.2f",result);
    }
    private static long printFactorial1(double num1) {

       long fact1 = 1;
        for (int i = 1; i <= num1; i++) {
            fact1 = fact1 * i;
        }
        return fact1;
    }
    private static long printFactorial2(double num2) {
        long fact2 = 1;
        for (int i = 1; i <= num2; i++) {
            fact2 = fact2 * i;
        }
        return fact2;
    }

}
