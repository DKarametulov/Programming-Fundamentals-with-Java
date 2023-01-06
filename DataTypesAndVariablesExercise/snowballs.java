package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int snowballs = Integer.parseInt(scanner.nextLine());

double biggerSnowBalls = Double.MIN_VALUE;

        for (int i = 1; i <= snowballs ; i++) {
            int snowBallSnow = Integer.parseInt(scanner.nextLine());
          int  snowBallTime = Integer.parseInt(scanner.nextLine());
         int  snowBallQuality = Integer.parseInt(scanner.nextLine());


           long snowBallValue = (long) Math.pow((snowBallSnow * 1.0 / snowBallTime),snowBallQuality);
            if (snowBallValue >= biggerSnowBalls) {
                biggerSnowBalls = snowBallValue;

                System.out.printf("%d : %d = %d (%d)", snowBallSnow, snowBallTime, snowBallValue, snowBallQuality);

            }
        }
    }
}
