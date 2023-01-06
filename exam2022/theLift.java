package exam2022;

import java.util.Arrays;
import java.util.Scanner;

public class theLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = Integer.parseInt(scanner.nextLine());
        int[] wagonsArrays = Arrays.stream(scanner.nextLine()
                .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 0; i < wagonsArrays.length; i++) {




        }
        }
    }

