package exam2022;

import java.util.*;
import java.util.stream.Collectors;

public class numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        double sum = 0;
        double avg = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
            avg = sum / numbers.size();
        }
        List<Integer> numbersList = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > avg) {
                numbersList.add(numbers.get(i));
            }
        }
        Collections.sort(numbersList);
        Collections.reverse(numbersList);
        if (numbersList.isEmpty()) {
            System.out.println("No");
        } else if (numbersList.size() >= 5) {
            for (int i = 0; i < 5; i++) {
                System.out.print(numbersList.get(i) + " ");

            }

        } else {
            System.out.print(numbersList.toString().replaceAll("[\\[\\],]", ""));
        }
    }
}




