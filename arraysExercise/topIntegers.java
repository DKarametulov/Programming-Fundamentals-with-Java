package arraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class topIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(el -> Integer.parseInt(el))
                .toArray();

        for (int index = 0; index < numbers.length ; index++) {
            int currentElement = numbers[index];
            int leftSum = 0;
            int rightSum = 0;


            for (int leftIndex = 0; leftIndex < index; leftIndex++) {
                leftSum += numbers[leftIndex];

            }
            for (int right = index + 1; right <= numbers.length - 1; right++) {
                rightSum += numbers[right];


            }
            if (rightSum == leftSum) {
                System.out.println(index);
                return;
            }
        }
        System.out.println("no");

    }
}
