package arraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class arrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] commandTools = command.split(" ");
            String commandType = commandTools[0];
            switch (commandType) {
                case "swap":
                    int index1 = Integer.parseInt(commandTools[1]);
                    int index2 = Integer.parseInt(commandTools[2]);

                    int element1 = numbers[index1];
                    int element2 = numbers[index2];
                    numbers[index1] = element2;
                    numbers[index2] = element1;
                    break;
                case "multiply":
                    int indexMultiply1 = Integer.parseInt(commandTools[1]);
                    int indexMultiply2 = Integer.parseInt(commandTools[2]);
                    int elementMultiply1 = numbers[indexMultiply1];
                    int elementMultiply2 = numbers[indexMultiply2];
                    int result = elementMultiply1 * elementMultiply2;
                    numbers[indexMultiply1] = result;
                    break;
                case "decrease":
                    for (int i = 0; i < numbers.length; i++) {
                        numbers[i] -= 1;
                    }
                    break;
            }
            command = scanner.nextLine();
        }
        for (int i = 0; i < numbers.length; i++) {

            if (i != numbers.length - 1) {
                System.out.print(numbers[i] + ", ");

            } else {
                System.out.print(numbers[i]);
            }

        }
    }
}