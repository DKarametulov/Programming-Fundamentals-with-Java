package exam2022;

import java.util.Scanner;

public class bonusScoringSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfTheStudent = Integer.parseInt(scanner.nextLine());
        int numberOfTheLecture = Integer.parseInt(scanner.nextLine());
        int additionalBonus = Integer.parseInt(scanner.nextLine());
        double maxBonus = 0;
        int atendant = 0;

        for (int i = 0; i < numberOfTheStudent; i++) {
            int attendanceOfEachStudent = Integer.parseInt(scanner.nextLine());

            double totalBonus = 1.0 * attendanceOfEachStudent / numberOfTheLecture
                    * (5 + additionalBonus);

            if (maxBonus < totalBonus) {
                maxBonus = totalBonus;
                atendant = attendanceOfEachStudent;
            }
        }
        System.out.printf("Max Bonus: %.0f.%n", Math.ceil(maxBonus));
        System.out.printf("The student has attended %s lectures.", atendant);
    }
}