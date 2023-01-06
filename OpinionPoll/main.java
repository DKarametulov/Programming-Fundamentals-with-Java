package OpinionPoll;

import java.io.OutputStream;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n ; i++) {
            String personalData = scanner.nextLine();

            String name = personalData.split(" ")[0];
           int age =Integer.parseInt(personalData.split(" ")[1]);

           if (age > 30){

               System.out.println(name + " - " + age);
           }

        }
    }
}
