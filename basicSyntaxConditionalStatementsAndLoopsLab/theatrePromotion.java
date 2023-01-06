package basicSyntaxConditionalStatementsAndLoopsLab;

import java.util.Scanner;

public class theatrePromotion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeOfDay = scanner.nextLine();
        int ageOfPerson = Integer.parseInt(scanner.nextLine());
        double price = 0;

        if (typeOfDay.equals("Weekday")){
            if (ageOfPerson >= 0 && ageOfPerson <= 18) {
                price = 12;
            } else if (ageOfPerson > 18 && ageOfPerson <= 64) {
                price = 18;

            } else if (ageOfPerson > 64 && ageOfPerson <= 122) {
                price = 12;

            }

        } else if (typeOfDay.equals("Weekend")) {
            if (ageOfPerson >= 0 && ageOfPerson <= 18) {
                price = 15;
            } else if (ageOfPerson > 18 && ageOfPerson <= 64) {
                price = 20;

            } else if (ageOfPerson > 64 && ageOfPerson <= 122) {
                price = 15;

            }

        } else if (typeOfDay.equals("Holiday")) {
            if (ageOfPerson >= 0 && ageOfPerson <= 18) {
                price = 5;
            } else if (ageOfPerson > 18 && ageOfPerson <= 64) {
                price = 12;

            } else if (ageOfPerson > 64 && ageOfPerson <= 122) {
                price = 10;

            }
        }if (ageOfPerson < 0 || ageOfPerson > 122){
            System.out.println("Error!");
        }else
            System.out.printf("%.0f$",price);
    }
}
