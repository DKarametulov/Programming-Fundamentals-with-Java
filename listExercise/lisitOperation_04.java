package listExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class lisitOperation_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("End")) {
            if (command.contains("Add")) {
                int numberToAdd = Integer.parseInt(command.split(" ")[1]);
                numbers.add(numberToAdd);

            } else if (command.contains("Insert")) {
                int numberToInsert = Integer.parseInt(command.split(" ")[1]);
                int index = Integer.parseInt(command.split(" ")[2]);
                if (isValidIndex(index,numbers.size())){
                    numbers.add(index, numberToInsert);
                }else {
                    System.out.println("Invalid index");
                }

            } else if (command.contains("Remove")) {
                int numberToRemove = Integer.parseInt(command.split(" ")[1]);
                if (isValidIndex(numberToRemove, numbers.size())) {
                    numbers.remove(numberToRemove);
                } else {
                    System.out.println("Invalid index");
                }

            } else if (command.contains("Shift left")) {
                int countLeft = Integer.parseInt(command.split(" ")[2]);
                for (int i = 0; i < countLeft; i++) {
                    int firstNumber = numbers.get(0);
                    numbers.add(firstNumber);
                    numbers.remove(0);

                }

            } else if (command.contains("Shift right")) {
                int countRight = Integer.parseInt(command.split(" ")[2]);
                for (int i = 0; i < countRight; i++) {
                    int lastNum = numbers.get(numbers.size() - 1);
                    numbers.add(0, lastNum);
                    numbers.remove(numbers.size() - 1);
                }
            }

            command = scanner.nextLine();
        }
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

    private static boolean isValidIndex(int index, int sizeofList) {
        return index >= 0 && index <= sizeofList - 1;
    }
}
