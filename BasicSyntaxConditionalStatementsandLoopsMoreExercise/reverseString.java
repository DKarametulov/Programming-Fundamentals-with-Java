package BasicSyntaxConditionalStatementsandLoopsMoreExercise;

import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        String message = "";
        for (int i = 1; i <= number; i++) {

            String input = scanner.nextLine();


            int numberOfDigit = input.length();
            char buttonNumber = input.charAt(0);

            if (buttonNumber == '2') {
                if (numberOfDigit == 1) {
                    message += "a";
                } else if (numberOfDigit == 2) {
                    message += "b";

                } else if (numberOfDigit == 3) {
                    message += "c";

                }

            } else if (buttonNumber == '3') {
                if (numberOfDigit == 1) {
                    message += "d";
                } else if (numberOfDigit == 2) {
                    message += "e";

                } else if (numberOfDigit == 3) {
                    message += "f";

                }

            } else if (buttonNumber == '4') {
                if (numberOfDigit == 1) {
                    message += "g";
                } else if (numberOfDigit == 2) {
                    message += "h";

                } else if (numberOfDigit == 3) {
                    message += "i";

                }

            } else if (buttonNumber == '5') {
                if (numberOfDigit == 1) {
                    message += "j";
                } else if (numberOfDigit == 2) {
                    message += "k";

                } else if (numberOfDigit == 3) {
                    message += "l";

                }

            } else if (buttonNumber == '6') {
                if (numberOfDigit == 1) {
                    message += "m";
                } else if (numberOfDigit == 2) {
                    message += "n";

                } else if (numberOfDigit == 3) {
                    message += "o";

                }

            } else if (buttonNumber == '7') {
                if (numberOfDigit == 1) {
                    message += "p";
                } else if (numberOfDigit == 2) {
                    message += "q";

                } else if (numberOfDigit == 3) {
                    message += "r";

                } else if (numberOfDigit == 4) {
                    message += "s";

                }

            } else if (buttonNumber == '8') {
                if (numberOfDigit == 1) {
                    message += "t";
                } else if (numberOfDigit == 2) {
                    message += "u";

                } else if (numberOfDigit == 3) {
                    message += "v";

                }

            } else if (buttonNumber == '9') {
                if (numberOfDigit == 1) {
                    message += "w";
                } else if (numberOfDigit == 2) {
                    message += "x";

                } else if (numberOfDigit == 3) {
                    message += "y";

                } else if (numberOfDigit == 4) {
                    message += "z";
                }
            } else if ( buttonNumber == '0') {
                message += " ";

            }

        }
        System.out.println(message);
    }


}

