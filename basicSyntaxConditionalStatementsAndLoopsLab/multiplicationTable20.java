package basicSyntaxConditionalStatementsAndLoopsLab;

import java.util.Scanner;

public class multiplicationTable20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int result = 0;

        for (int i = firstNum; i <= firstNum; i++) {
            for (int j = secondNum; j <= 10; j++) {
                result = i * j;
                System.out.printf("%d X %d = %d%n", firstNum, j, result);

            }

        }if (secondNum > 10){
            result = firstNum * secondNum;
            System.out.printf("%d X %d = %d%n", firstNum, secondNum, result);

        }

    }
    }

