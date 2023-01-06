package listExercise;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class changeList_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")){
            String input = command.split(" ")[0];
            if (input.equals("Delete")){
                for (int i = 0; i <numbers.size() ; i++) {


                    int numberToRemove = Integer.parseInt(command.split(" ")[1]);
                    numbers.remove(Integer.valueOf(numberToRemove));
                }
            } else if (input.equals("Insert")) {
                int numberToInsert = Integer.parseInt(command.split(" ")[1]);
                int index = Integer.parseInt(command.split(" ")[2]);
                numbers.add(index,numberToInsert);

            }
            command = scanner.nextLine();
        }
        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
    }
}
