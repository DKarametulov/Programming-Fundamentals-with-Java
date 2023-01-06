package arraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class maxSequenceofEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int length = 1;
        int maxLength = 0;
        int startLength = 0;
        int bestIndex = 0;

        for (int i = 1; i <= array.length - 1; i++) {
            if (array[i] == array[i - 1]) {
                length++;
            } else {
                length = 1;
                startLength = i;
            }
            if (length > maxLength) {
                maxLength = length;
                bestIndex = startLength;
            }
        }
        for (int j = bestIndex; j < bestIndex + maxLength; j++) {
            System.out.print(array[j] + " ");
        }
    }
}