package forLoopLab;

import java.util.Scanner;

public class minNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        int minNum = Integer.MAX_VALUE;

        while (!command.equals("Stop")){
            int currentNum = Integer.parseInt(command);
            if (currentNum < minNum){
                minNum = currentNum;
            }
            command = scanner.nextLine();

        }
        System.out.println(minNum);

    }
}
