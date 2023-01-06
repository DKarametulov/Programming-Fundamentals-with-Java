package exam2022;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class movingTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine()
                .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("End")){
            String[] inputLine = command.split(" ");
            String input = inputLine[0];

            switch (input){
                case "Shoot":
                   int indexShoot = Integer.parseInt(inputLine[1]);
                   int powerShoot = Integer.parseInt(inputLine[2]);



                    break;
                case "Add":
                    break;
                case "Strike":
                    break;
            }




            command = scanner.nextLine();
        }
    }
}
