package basicSyntaxConditionalStatementsAndLoopsLab;

import java.util.Scanner;

public class studentInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameStudent = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        double grade = Double.parseDouble(scanner.nextLine());

        System.out.printf("Name: %s, Age: %d, Grade: %.2f",nameStudent, age, grade);


    }
}
