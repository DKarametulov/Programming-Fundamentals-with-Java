package exam2022;

import java.util.Scanner;

public class blackFlag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int dailyPlunder = Integer.parseInt(scanner.nextLine());
        double expectedPlunder = Double.parseDouble(scanner.nextLine());
        int countDays = 0;
        double totalPlunder = 0;

        for (int i = 1; i < days - 1 ; i++) {
            totalPlunder += dailyPlunder;
            countDays++;
            if (countDays % 3 == 0) {
                totalPlunder = totalPlunder + dailyPlunder * 0.5;
            }
            if (countDays % 5 == 0) {
                totalPlunder = totalPlunder - (totalPlunder * 0.30);
            }

        }
        System.out.printf("Ahoy! %.2f plunder gained.",totalPlunder );
    }
}

