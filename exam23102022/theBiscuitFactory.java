package exam23102022;

import java.util.Scanner;

public class theBiscuitFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      int numberBiscuitsPerDay = Integer.parseInt(scanner.nextLine());
        int countWorker = Integer.parseInt(scanner.nextLine());
        int numberBiscuitsPer30Days = Integer.parseInt(scanner.nextLine());

       double totalBiscuits = 0;
        int count = 0;
        for (int i = 1; i <= 30; i++) {
            count++;
            if (count % 3 == 0) {


            totalBiscuits += numberBiscuitsPerDay * countWorker;


            }

        }
        System.out.println(totalBiscuits);
    }
}
