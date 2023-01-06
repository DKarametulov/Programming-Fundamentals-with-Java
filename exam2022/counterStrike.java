package exam2022;

import java.util.Scanner;

public class counterStrike {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int power = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();
        boolean noMorePower = false;
        int countBattle = 0;

        while (!command.equals("End of battle")) {
            int distance = Integer.parseInt(command);

            if (power >= distance) {
                power -= distance;
                countBattle++;
            }else {
               noMorePower = true;
                System.out.printf("Not enough energy! Game ends with %d won battles and %d energy", countBattle, power);
                break;

            }
            if (countBattle % 3 == 0) {
                power += countBattle;
            }
            command = scanner.nextLine();
        }
        if (!noMorePower) {
            System.out.printf("Won battles: %d. Energy left: %d", countBattle, power);
        }
    }
}
