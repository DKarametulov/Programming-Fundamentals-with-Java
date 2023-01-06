package forLoopLab;

import java.util.Scanner;

public class oldBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String wantedBook = scanner.nextLine();

        String command = scanner.nextLine();
        int countBooks = 0;
        boolean isFound = false;
        while (!command.equals("No More Books")){

            if (command.equals(wantedBook)){
                isFound = true;
                break;
            }
            countBooks++;
            command = scanner.nextLine();

        }
        if (isFound){
            System.out.printf("You checked %d books and found it.",countBooks);
        }else {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.",countBooks);
        }

        }
    }

