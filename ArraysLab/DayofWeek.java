package ArraysLab;

import java.util.Scanner;

public class DayofWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] dayOfTheWeek = new String[]{
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday",
        };
        int n = Integer.parseInt(scanner.nextLine());

        if (n >= 1 && n <= 7){
            System.out.println(dayOfTheWeek[n - 1]);
        }else {
            System.out.println("Invalid day!");
        }


    }
}
