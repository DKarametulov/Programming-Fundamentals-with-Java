package BasicSyntaxConditionalStatementsandLoopsExercise;

import java.util.Scanner;

public class rageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lostGame = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int  trashHeadSet   = lostGame / 2;
      int trashMouse = lostGame / 3;
      int trashKeyboard = lostGame / 6;
      int trashDispley = lostGame / 12;


      double totalMoneyHeadset = trashHeadSet * headsetPrice;
      double totalMoneyMouse = trashMouse * mousePrice;
      double totalMoneyKeyboard = trashKeyboard * keyboardPrice;
      double totalMoneyDisplay = trashDispley * displayPrice;


      double total = totalMoneyHeadset + totalMoneyMouse + totalMoneyKeyboard + totalMoneyDisplay;
        System.out.printf("Rage expenses: %.2f lv.",total);

    }
}
