package ArraysLab;

import java.util.Scanner;

public class PrintNumbersinReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int[] numbersArr = new int[n];

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            numbersArr[i] = number;

        }

            for (int j = numbersArr.length - 1; j >= 0; j--) {


                System.out.print(numbersArr[j] + " ");

            }
        }
    }

