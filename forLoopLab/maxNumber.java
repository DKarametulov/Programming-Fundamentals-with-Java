package forLoopLab;

import java.util.Scanner;

public class maxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int maxNum = Integer.MIN_VALUE;

        while (!command.equals("Stop")){
            int numbers = Integer.parseInt(command);

            if (numbers > maxNum) {
                maxNum = numbers;
            }
                command = scanner.nextLine();
            }
            System.out.println(maxNum);
        }

    }

