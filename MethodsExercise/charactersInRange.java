package MethodsExercise;

import java.util.Scanner;

public class charactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char symbols1 = scanner.nextLine().charAt(0);
        char symbols2 = scanner.nextLine().charAt(0);
        printCharInRange(symbols1, symbols2);
        printCharInRange1(symbols1,symbols2);
    }

    private static void printCharInRange(char symbols1, char symbols2) {

        for (int i = symbols1 + 1; i < symbols2; i++) {
            System.out.print((char) i + " ");
        }
    }

    private static void printCharInRange1(char symbols1, char symbols2) {
        for (int i = symbols2 + 1; i < symbols1; i++) {
            System.out.print((char) i + " ");
        }
    }
}

