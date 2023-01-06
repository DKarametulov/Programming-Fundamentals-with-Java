package ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class equalArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] firstNum = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] secondNum = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int firstSum = 0;
        boolean identical = false;
        for (int i = 0; i < firstNum.length; i++) {
            firstSum += firstNum[i];


            if (firstNum[i] != secondNum[i]) {
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                identical = true;
                break;
            }
        }
        if (!identical) {
            System.out.printf("Arrays are identical. Sum: %d",firstSum);

        }
    }
}
