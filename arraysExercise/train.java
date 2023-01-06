package arraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfWagon = Integer.parseInt(scanner.nextLine());

        int[] wagons = new int[numberOfWagon];

        int sum = 0;

        for (int i = 0; i < wagons.length; i++) {
            int numberOfPeople = Integer.parseInt(scanner.nextLine());
            wagons[i] = numberOfPeople;
            sum += wagons[i];
        }
        for (int number : wagons) {
            System.out.print(number + " ");

        }
        System.out.println();
        System.out.println(sum);
        //System.out.println(Arrays.stream(wagons).sum());
    }
}
