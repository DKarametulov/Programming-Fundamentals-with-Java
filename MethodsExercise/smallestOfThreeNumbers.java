package MethodsExercise;

import java.util.Scanner;

public class smallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());

        printSmallestNumber(firstNum,secondNum,thirdNum);
    }
    private static void printSmallestNumber (int num1, int num2, int num3) {

        if (num1 <= num2 && num1 <= num3){
            System.out.println(num1);
        } else if (num2 <= num1 && num2 <= num3) {
            System.out.println(num2);
        } else if (num3 <= num1 && num3 <=num2) {
            System.out.println(num3);
        }
    }
}
