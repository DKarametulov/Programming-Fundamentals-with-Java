package arraysExercise;

import java.util.Scanner;

public class zigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] firstArray = new String[n];

        String[] secondArray = new String[n];


        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String firstNum = input.split(" ")[0];
            String secondNum = input.split(" ")[1];

            if ((i + 1) % 2 == 1) {
                firstArray[i] = firstNum;
                secondArray[i] = secondNum;
            } else {
                firstArray[i] = secondNum;
                secondArray[i] = firstNum;
            }
        }
            for (String element : firstArray) {
                System.out.print(element + " ");
            }
            System.out.println();
            for (String element1 : secondArray) {
                System.out.print(element1 + " ");
            }


        }

}