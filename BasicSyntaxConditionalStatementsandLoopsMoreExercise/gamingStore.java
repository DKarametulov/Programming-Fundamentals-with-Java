package BasicSyntaxConditionalStatementsandLoopsMoreExercise;

import java.util.Scanner;

public class gamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double balance = Double.parseDouble(scanner.nextLine());
        double currentBalance = balance;

        String command = scanner.nextLine();
        double price = 0;


        while (!command.equals("Game Time")) {
            String game = command;

            if (command.equals("OutFall 4")) {
                price = 39.99;
                currentBalance -= price;

            } else if (command.equals("CS: OG")) {
                price = 15.99;
                currentBalance -= price;

            } else if (command.equals("Zplinter Zell")) {
                price = 19.99;
                currentBalance -= price;

            } else if (command.equals("Honored 2")) {
                price = 59.99;
                currentBalance -= price;
            } else if (command.equals("RoverWatch")) {

                price = 29.99;
                currentBalance -= price;

            } else if (command.equals("RoverWatch Origins Edition")) {
                price = 39.99;
                currentBalance -= price;

            } else {
                System.out.println("Not Found");
                break;
            }
            command = scanner.nextLine();

            System.out.printf("Bought %s%n", game);
        }
        System.out.printf("Total spent: $%.2f. Remaining: $%.2f%n", Math.abs(currentBalance - balance), currentBalance);
        }


    }
