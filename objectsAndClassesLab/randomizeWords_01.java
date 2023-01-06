package objectsAndClassesLab;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class randomizeWords_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] wordArr = scanner.nextLine().split("\\s+");
        Random rdm = new Random();
        for (int i = 0; i < wordArr.length; i++) {
            int indexX  = rdm.nextInt(wordArr.length);
            int indexY  = rdm.nextInt(wordArr.length);
          String oldElement =wordArr[indexX];
          wordArr[indexX] = wordArr[indexY];
          wordArr[indexY] = oldElement;

        }
        for (String element :wordArr){
            System.out.println(element);
        }
    }
}
