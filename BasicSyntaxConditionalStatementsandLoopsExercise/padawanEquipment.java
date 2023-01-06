package BasicSyntaxConditionalStatementsandLoopsExercise;

import java.util.Scanner;

public class padawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double amountOfMoney = Double.parseDouble(scanner.nextLine());
        int countOfStudents = Integer.parseInt(scanner.nextLine());
        double priceOfLightsabers = Double.parseDouble(scanner.nextLine());
        double priceRobers = Double.parseDouble(scanner.nextLine());
        double priceBelts = Double.parseDouble(scanner.nextLine());
        int freeBelts = countOfStudents / 6;

        double neededMoney = 0;
        neededMoney = priceOfLightsabers * Math.ceil(countOfStudents * 1.10) + priceRobers * (countOfStudents) + priceBelts * (countOfStudents - freeBelts);

        if (neededMoney <= amountOfMoney){
            System.out.printf("The money is enough - it would cost %.2flv.",neededMoney);
        }else {
            System.out.printf("George Lucas will need %.2flv more.",neededMoney - amountOfMoney);
        }
    }

    }

