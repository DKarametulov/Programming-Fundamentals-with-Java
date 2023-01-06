package listExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class bombNumbers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> elementList = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        String[] data = scanner.nextLine().split(" ");
        String bombNumber = data[0];
        int power = Integer.parseInt(data[1]);
        int sum = 0;

        while (elementList.contains(bombNumber)){
            int elementIndex = elementList.indexOf(bombNumber);
            int left = Math.max(0,elementIndex - power);
            int right = Math.min(elementIndex + power, elementList.size() -1);

            for (int i = right; i >= left ; i--) {
                elementList.remove(i);

            }
        }
        System.out.println(elementList.stream().mapToInt(Integer::parseInt).sum());
    }
}
