package forLoopLab;

import java.util.Scanner;

public class SumNumberss {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;


        while (number > sum){
            int currentNum = Integer.parseInt(scanner.nextLine());
            sum += currentNum;

        }
        System.out.println(sum);

        }
    }

