package forLoopLab;

import java.util.Scanner;

public class vacantion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double vacationMoney = Double.parseDouble(scanner.nextLine());
        double availableMoney = Double.parseDouble(scanner.nextLine());
        double totalMoney = availableMoney;

        int totalDays = 0;
        int spendStreak = 0;

        boolean cantSaveMoney = false;
        while (totalMoney < vacationMoney) {
            totalDays++;
            String command = scanner.nextLine();
            double money = Double.parseDouble(scanner.nextLine());
               if (command.equals("save")) {
                   spendStreak = 0;
                   totalMoney = totalMoney + money;
               }
              if (command.equals("spend")){
                    spendStreak++;
                    totalMoney = totalMoney - money;
                    if (totalMoney < 0) {
                        totalMoney = 0;
                    }

            }
            if (spendStreak == 5) {
                cantSaveMoney = true;
                break;
            }

        }
        if (cantSaveMoney) {
            System.out.println("You can't save the money.");
            System.out.println(totalDays);
        } else {
            System.out.printf("You saved the money for %d days.", totalDays);


        }
    }
}
