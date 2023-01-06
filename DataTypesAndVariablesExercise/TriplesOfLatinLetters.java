package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int a = 0; a <= n - 1; a++) {
            for (int b = 0; b <= n - 1; b++) {
                for (int c = 0; c <= n - 1; c++) {

                    char firstChar = (char) ('a' + a);
                    char secondChar = (char) ('a' + b);
                    char thirdChar = (char) ('a' + c);

                    System.out.printf("%c%c%c%n", firstChar, secondChar, thirdChar);

                }

            }

        }

    }
}
