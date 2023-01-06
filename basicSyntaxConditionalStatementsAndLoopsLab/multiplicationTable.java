package basicSyntaxConditionalStatementsAndLoopsLab;

import java.util.Scanner;

public class multiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int result = 0;

        for (int i = n; i <= n ; i ++) {
            for (int j = 1; j <= 10 ; j++) {
                result = i * j;
                System.out.printf("%d X %d = %d%n",n,j,result);

            }
            
        }
    }
}
