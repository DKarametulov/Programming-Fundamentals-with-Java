package forLoopLab;

import java.util.Scanner;

public class coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double change = Double.parseDouble(scanner.nextLine());
        double coins = change * 100;
        int countCoins = 0;

        while (coins > 0){
            if (coins >= 200){
                countCoins++;
                coins -= 200;
            } else if (coins >= 100) {
                countCoins++;
                coins -= 100;

            } else if (coins >= 50) {
                countCoins++;
                coins -= 50;

            } else if (coins >= 20) {
                countCoins++;
                coins -= 20;
            } else if (coins >= 10) {
                countCoins++;
                coins -= 10;
            } else if (coins >= 5) {
                countCoins++;
                coins -= 5;
            } else if (coins >= 2) {
                countCoins++;
                coins -= 2;
            } else if (coins >= 1) {
                countCoins++;
                coins -= 1;
            }else {
                break;
            }
        }
        System.out.println(countCoins);
    }
}
