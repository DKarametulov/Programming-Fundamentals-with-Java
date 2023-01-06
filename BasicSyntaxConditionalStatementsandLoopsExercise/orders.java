package BasicSyntaxConditionalStatementsandLoopsExercise;

import java.util.Scanner;

public class orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double total = 0;
        double totalSum = 0;

        for (int i = 1; i <= n; i++) {
            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int countCapsule = Integer.parseInt(scanner.nextLine());

            total = ((days * countCapsule) * pricePerCapsule);
            System.out.printf("The price for the coffee is: $%.2f", total);

            totalSum += total;
            System.out.println();

        }

        System.out.printf("Total: $%.2f", totalSum);
    }
}

