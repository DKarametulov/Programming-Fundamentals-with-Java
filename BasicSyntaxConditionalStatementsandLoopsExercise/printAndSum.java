package BasicSyntaxConditionalStatementsandLoopsExercise;

import java.util.Scanner;

public class printAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        for (int i = firstNum; i <= secondNum ; i++) {

            System.out.print(i + " ");

            sum = sum + i;
        }
        System.out.println();
        System.out.printf("Sum: %d",sum);
    }
}
