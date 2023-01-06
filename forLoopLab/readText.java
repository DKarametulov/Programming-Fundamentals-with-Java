package forLoopLab;

import java.util.Scanner;

public class readText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        while (!command.equals("Stop")){
            System.out.println(command);
            command = scanner.nextLine();
        }
    }
}
