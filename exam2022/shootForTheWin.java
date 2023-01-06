package exam2022;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class shootForTheWin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine()
                .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("End")){
            int index = Integer.parseInt(command);
            if (index >= 0 && index < numbersList.size()){

                for (int i = 0; i < numbersList.size(); i++) {
                    int currentTarget = index;

                }
            }
            
            command= scanner.nextLine();
        }
    }
}
