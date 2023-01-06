package DataTypesndVariablesLab;

import java.util.Scanner;

public class specialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i <= number ; i++) {
            int digits = i;
            int sum = 0;

            while (digits > 0) {
                sum += digits % 10;
                digits = digits / 10;
            }

            if (sum == 5 || sum == 7 || sum == 11)
            {
                System.out.printf("%s -> True%n",i);
            }
            else

                System.out.printf("%s -> False%n",i);
            }
        }
    }

