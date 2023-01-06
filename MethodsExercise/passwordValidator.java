package MethodsExercise;

import java.util.Scanner;

public class passwordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String password = scanner.nextLine();
        boolean isPasswordLengthValid = lengthStringCharacters(password);
        if (!isPasswordLengthValid) {
            System.out.println("Password must be between 6 and 10 characters");

        }
        boolean isValidContendValid = isValidDigitAndLetters (password);
        if (!isValidContendValid){
            System.out.println("Password must consist only of letters and digits");
        }
        boolean isPasswordCountDigitValid = countDigit(password);

        if (!isPasswordCountDigitValid){
            System.out.println("Password must have at least 2 digits");
        }
        if (isPasswordLengthValid && isValidContendValid && isPasswordCountDigitValid){
            System.out.println("Password is valid");

        }


    }

    private static boolean lengthStringCharacters(String password) {
        if (password.length() >= 6 && password.length() <= 10) {
            return true;

        } else {
            return false;
        }
    }

    private static boolean isValidDigitAndLetters(String password) {
        for (char symbol : password.toCharArray()) {
            if (!Character.isLetterOrDigit(symbol)) {
                return false;
            }
        }
        return true;
    }

    private static boolean countDigit(String password) {
        int countDigit = 0;

        for (char symbol : password.toCharArray()) {
            if (Character.isDigit(symbol)) {
                countDigit++;
            }
        }
        if (countDigit >= 2) {
            return true;
        } else {
            return false;
        }

    }
}
