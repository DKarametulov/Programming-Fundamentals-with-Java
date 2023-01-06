package DataTypesndVariablesLab;

import java.util.Scanner;

public class poundsToDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pounds = Double.parseDouble(scanner.nextLine());
        double dollars = 0;

        dollars = pounds * 1.36;
        System.out.printf("%.3f",dollars);
    }
}
