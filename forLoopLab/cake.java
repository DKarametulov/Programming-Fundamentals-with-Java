package forLoopLab;

import java.util.Scanner;

public class cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int w = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());

        int cakePieces = w * l;


        boolean noMoreCake = false;

        String command = scanner.nextLine();

        while (!command.equals("STOP")) {
            int takePieces = Integer.parseInt(command);
           cakePieces = cakePieces - takePieces;




            if (cakePieces < 0) {
                noMoreCake = true;
                break;
            }
            command = scanner.nextLine();
        }

            if (noMoreCake){
                System.out.printf("No more cake left! You need %d pieces more.",Math.abs(cakePieces));
            }else {
                System.out.printf("%d pieces are left.",cakePieces );
            }




        }


    }
