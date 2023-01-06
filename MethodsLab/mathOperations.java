package MethodsLab;

import java.util.Scanner;

public class mathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double firstNum = Double.parseDouble(scanner.nextLine());
        String operator = scanner.nextLine();
       double secondNum = Double.parseDouble(scanner.nextLine());

        switch (operator){
            case "/":
               printResultDivide(firstNum, secondNum);
                break;
            case "*":
                printResultMultiply(firstNum, secondNum);
                break;
            case "+":
                printResultAdd(firstNum, secondNum);
                break;
            case "-":
                printResultSubtract(firstNum, secondNum);
                break;
        }
    }
    public static void printResultDivide(double firstNum , double secondNum) {
        System.out.printf("%.0f",firstNum / secondNum);

    }
    public static void printResultMultiply(double firstNum , double secondNum) {
        System.out.printf("%.0f",firstNum * secondNum);
    }
    public static void printResultAdd(double firstNum , double secondNum) {
        System.out.printf("%.0f",firstNum + secondNum);
    }
    public static void printResultSubtract(double firstNum , double secondNum) {
        System.out.printf("%.0f",firstNum - secondNum);

    }
}
