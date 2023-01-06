package forLoopLab;

import java.util.Scanner;

public class password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userName = scanner.nextLine();
        String password = scanner.nextLine();


        String newPassword = scanner.nextLine();


        while (!newPassword.equals(password)){

             newPassword = scanner.nextLine();
        }
        System.out.printf("Welcome %s!",userName);
    }
}
