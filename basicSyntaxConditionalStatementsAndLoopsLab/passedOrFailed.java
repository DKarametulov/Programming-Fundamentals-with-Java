package basicSyntaxConditionalStatementsAndLoopsLab;

import java.util.Scanner;

public class passedOrFailed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double grade = Double.parseDouble(scanner.nextLine());

        if (grade < 3.00) {
            System.out.println("Failed!");
        }else
            System.out.println("Passed!");
    }
}
