package forLoopLab;

import java.util.Scanner;

public class evenPowersOf2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int counter = 1;
        for (int i = 1; i <= n; i+=2) {
            System.out.println(counter);
            counter = counter * 2 * 2;



        }
    }
}
