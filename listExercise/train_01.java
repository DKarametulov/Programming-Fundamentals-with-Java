package listExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagonsList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int capacity = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();

        while (!command.equals("end")){
            String commandLine = command.split(" ")[0];

            if (commandLine.equals("Add")){
                int passengerAdd = Integer.parseInt(command.split(" ")[1]);
                wagonsList.add(passengerAdd);
            }else {
                int passenger = Integer.parseInt(commandLine);
                for (int i = 0; i < wagonsList.size(); i++) {
                    if (wagonsList.get(i) + passenger <= capacity){
                        wagonsList.set(i,wagonsList.get(i) + passenger);
                        break;
                    }
                }
            }


            command = scanner.nextLine();
        }
        System.out.println(wagonsList.toString().replaceAll("[\\[\\],]",""));
    }
}
