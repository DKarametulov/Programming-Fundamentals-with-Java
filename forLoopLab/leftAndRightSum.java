package forLoopLab;

import java.util.Scanner;

public class leftAndRightSum {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int n = Integer.parseInt(scanner.nextLine());
            int leftSum = 0;
            int rightSum = 0;

        for (int i = 1; i <= n ; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            leftSum += currentNum;


        }for (int j = 1; j <= n ; j++) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            rightSum += currentNum;

        }
        if (leftSum == rightSum){
            System.out.printf("Yes, sum = %d",leftSum);

        }else {
            System.out.printf("No, diff = %d",Math.abs(leftSum - rightSum));
        }
    }
}