package arraysExercise;

import java.util.Scanner;

public class commonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstLine = scanner.nextLine();

        String secondLine = scanner.nextLine();


        String[] firstArray = firstLine.split(" ");

        String[] secondArray = secondLine.split(" ");


        for (String element2 :secondArray) {

            for (String element1 : firstArray) {

                if (element2.equals(element1)) {

                    System.out.print(element2 + " ");

                }
            }
        }
    }
}