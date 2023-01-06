package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class waterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int number =Integer.parseInt(scanner.nextLine());
        int capacity = 255;
        int volume = 0;


        for (int i = 1; i <= number; i++) {
            int litres = Integer.parseInt(scanner.nextLine());

            if (volume + litres <= capacity){
                volume+=litres;
            }else {
                System.out.println("Insufficient capacity!");
            }

        }

        System.out.println(volume);
    }
}
