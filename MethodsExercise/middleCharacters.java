package MethodsExercise;

import java.util.Scanner;

public class middleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        printMiddleCharacters(text);
        
    }
    private static void printMiddleCharacters(String text){

        if (text.length() % 2 == 1){
           int indexOfMiddleCharacter = text.length()/ 2;
            System.out.println(text.charAt(indexOfMiddleCharacter));
        }else {
            int indexFirstMiddleSymbol = text.length() / 2 - 1;
            int indexSecondMiddleSymbol = text.length() / 2;

            System.out.println(text.charAt(indexFirstMiddleSymbol) +""+ text.charAt(indexSecondMiddleSymbol));

        }
    }
}
