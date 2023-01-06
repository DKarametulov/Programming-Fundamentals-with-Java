package arraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class equalsSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arrays = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();


        for (int index = 0; index < arrays.length; index++) {

            int leftSum = 0;
            int rightSum = 0;

            for (int leftIndex = 0; leftIndex < index ; leftIndex++) {
                leftSum += arrays[leftIndex];

            }
            for (int rightIndex = index + 1; rightIndex <= arrays.length - 1 ; rightIndex++) {
                rightSum += arrays[rightIndex];

            }
            if (leftSum == rightSum){
                System.out.println(index);
                return;
            }

        }
        System.out.println("no");
    }
}
