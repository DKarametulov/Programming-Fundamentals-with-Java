package MethodsLab;

import java.util.Scanner;

public class orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        switch (product) {
            case "coffee":
                printCoffee(quantity);
                break;
            case "water":
                printWatter(quantity);
                break;
            case "coke":
                printCoke(quantity);
                break;
            case "snacks":
                printSnacks(quantity);
                break;
        }

    }
    public static void printCoffee (int quantity){
        double price = 1.50 * quantity;
        System.out.printf("%.2f",price);

    }  public static void printWatter (int quantity){
        double price = 1.00 * quantity;
        System.out.printf("%.2f",price);

    }  public static void printCoke (int quantity){
        double price = 1.40 * quantity;
        System.out.printf("%.2f",price);

    }  public static void printSnacks (int quantity){
        double price = 2.00 * quantity;
        System.out.printf("%.2f",price);
    }

}
