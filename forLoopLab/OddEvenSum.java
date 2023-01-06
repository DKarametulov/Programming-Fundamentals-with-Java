package forLoopLab;

import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int evenNum = 0;
        int oddNum = 0;

        for (int i = 1; i <= n; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());

            if (i % 2 ==0){
                evenNum += currentNum;
            }
            else {
                oddNum += currentNum;
            }

            }
        int diff = Math.abs(oddNum - evenNum);
        if (oddNum == evenNum){
            System.out.println("Yes");
            System.out.printf("Sum = %d",oddNum);
        }
        else {
            System.out.println("No");
            System.out.printf("Diff = %d",diff);
        }


        }
    }

