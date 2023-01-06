package forLoopLab;

import java.util.Scanner;

public class accountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        double totalMoney = 0;

        while (!command.equals("NoMoreMoney")) {
            double currentMoney = Double.parseDouble(command);
            if (currentMoney < 0) {

                System.out.println("Invalid operation!");
                break;
            }
            System.out.printf("Increase: %.2f%n",currentMoney);

            totalMoney = totalMoney + currentMoney;
            command = scanner.nextLine();
        }
        System.out.printf("Total: %.2f", totalMoney);
    }
}