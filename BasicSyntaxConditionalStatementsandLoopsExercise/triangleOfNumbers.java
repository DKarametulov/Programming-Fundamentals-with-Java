package BasicSyntaxConditionalStatementsandLoopsExercise;

import java.util.Scanner;

public class triangleOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        for (int rows = 1; rows <= num; rows++) {
            for (int i = 1; i <= rows; i++) {
                System.out.print(rows + " ");

            }

            System.out.println();
        }
    }
}