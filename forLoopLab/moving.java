package forLoopLab;

import com.sun.source.tree.IfTree;

import java.util.Scanner;

public class moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int w = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());
        int h = Integer.parseInt(scanner.nextLine());

        int space = w * l * h;
        boolean noMoreSpace = false;


        String command = scanner.nextLine();

        while (!command.equals("Done")){
            int countBoxes = Integer.parseInt(command);

            space -= countBoxes;

            if (space < 0){
                noMoreSpace = true;
                break;

            }


            command = scanner.nextLine();
        }

        if (noMoreSpace){
            System.out.printf("No more free space! You need %d Cubic meters more.",Math.abs(space));
        }else {
            System.out.printf("%d Cubic meters left.",space);
        }

    }
}
