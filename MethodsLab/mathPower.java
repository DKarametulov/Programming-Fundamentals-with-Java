package MethodsLab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class mathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        double power = Double.parseDouble(scanner.nextLine());
        System.out.println(new DecimalFormat("0.####").format(printMathPower(number,power)));

    }
    public static double printMathPower (double number, double power){
        double result = 1;

        result = Math.pow(number , power);

        return result;
    }
}
