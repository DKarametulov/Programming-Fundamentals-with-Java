package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class spiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int startingYield = Integer.parseInt(scanner.nextLine());
        int yield = 0;
        int countDays = 0;
        for (int i = startingYield; i >= 100 ; i-=10) {
            yield = (yield + i) - 26;

            countDays++;
        }
        System.out.println(countDays);

        if (yield >= 26){
            System.out.println(yield - 26);

        }else {
            System.out.println(yield);
        }

    }
}
