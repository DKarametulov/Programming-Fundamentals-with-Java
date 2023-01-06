package forLoopLab;

import java.util.Scanner;

public class graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double sum = 0;
        int year = 1;
        int poorGrade = 0;

        while (year <= 12) {
            if (poorGrade == 2){
                break;
            }
            double currentGrade = Double.parseDouble(scanner.nextLine());
            if (currentGrade < 4) {
                poorGrade++;
                continue;
            }
            sum = sum + currentGrade;
            year++;
        }
        if (poorGrade == 2) {
            System.out.printf("%s has been excluded at %d grade", name, year);
        } else {
            double average = sum / (year - 1);
            System.out.printf("%s graduated. Average grade: %.2f", name, average);
        }
    }
}


