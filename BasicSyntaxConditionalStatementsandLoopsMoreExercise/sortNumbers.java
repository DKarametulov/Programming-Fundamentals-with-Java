package BasicSyntaxConditionalStatementsandLoopsMoreExercise;

import java.util.Scanner;

public class sortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int numberOne = Integer.parseInt(scanner.nextLine());
        int numberTwo = Integer.parseInt(scanner.nextLine());
        int numberThird = Integer.parseInt(scanner.nextLine());


        if (numberOne > numberTwo && numberOne > numberThird) {
            System.out.println(numberOne);

            if (numberTwo > numberThird) {

                System.out.println(numberTwo);
                System.out.println(numberThird);

            } else {
                System.out.println(numberThird);
                System.out.println(numberTwo);


            }
        } else if (numberTwo > numberOne && numberTwo > numberThird) {
            System.out.println(numberTwo);
            if (numberOne > numberThird){
                System.out.println(numberOne);
                System.out.println(numberThird);
            }else {
                System.out.println(numberThird);
                System.out.println(numberOne);
            }
        } else if (numberThird > numberOne && numberThird > numberTwo) {
            System.out.println(numberThird);
            if (numberOne > numberTwo){
                System.out.println(numberOne);
                System.out.println(numberTwo);
            }else {
                System.out.println(numberTwo);
                System.out.println(numberOne);
            }

        }

    }


    }



