package exam2022;

import java.util.Scanner;

public class softUniReception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int employer1 = Integer.parseInt(scanner.nextLine());
        int employer2 = Integer.parseInt(scanner.nextLine());
        int employer3 = Integer.parseInt(scanner.nextLine());
        int countStudents = Integer.parseInt(scanner.nextLine());

        int studentPerHour = employer1 + employer2 + employer3;
        int time = 0;
        while (countStudents > 0) {
            countStudents -= studentPerHour;
            time++;

            if (time % 4 == 0){
                time ++;
            }
        }
        System.out.printf("Time needed: %dh.", time);
    }
}
