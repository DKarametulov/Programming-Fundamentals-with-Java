package DataTypesndVariablesLab;

import java.math.BigDecimal;
import java.util.Scanner;

public class centuriestoMinutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      int centuries = Integer.parseInt(scanner.nextLine());

       double years = 0;
        double days = 0;
        double hours = 0;
        double minutes = 0;


        years = centuries * 100;
        days = years * 365.2422;
        hours = days * 24;
        minutes = hours * 60;
        System.out.printf("%d centuries = %.0f years = %.0f days = %.0f hours = %.0f minutes",centuries,years,days,hours,minutes);

    }
}
