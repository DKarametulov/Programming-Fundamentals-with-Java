package MethodsLab;

import java.util.Scanner;

public class printTriangle {
    private static int start;
    private static int end;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        printTriangle(number);

    }

    public static void printTriangle(int number) {
        for (int i = 1; i <= number; i++) {
      printLine(1, i);
        }
        for (int i =number - 1; i >= 1; i--) {
           printLine(1 , i);
        }
    }

    public static void printLine(int start, int end) {
        printTriangle.start = start;
        printTriangle.end = end;

        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");

        }
        System.out.println();
    }
}