package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class beerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double biggestKeg = Double.MIN_VALUE;
        String maxModel = "";

        for (int i = 1; i <= n; i++) {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            double height = Integer.parseInt(scanner.nextLine());

            double volume = 0;
            volume = Math.PI * Math.pow(radius, 2) * height;

            if (biggestKeg <= volume) {
                biggestKeg = volume;
                maxModel = model;

            }
        }
        System.out.println(maxModel);
    }
}