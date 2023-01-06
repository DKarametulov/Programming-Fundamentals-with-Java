package ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class evenandOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[]num = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int even = 0;
        int odd = 0;
        for (int i = 0; i < num.length ; i++) {

            if ( num[i] % 2==0 ){
                even += num[i];
            }else {
                odd += num[i];
            }

        }
        System.out.println(even - odd);

    }
}
