package ListsLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class mergingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstList = Arrays.stream(scanner.nextLine()
                .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> secondList = Arrays.stream(scanner.nextLine()
                .split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> result = new ArrayList<>();

        int minSize = Math.min(firstList.size(),secondList.size());

        for (int i = 0; i <minSize ; i++) {

            int firstItem = firstList.get(i);
            int secondtItem = secondList.get(i);

            result.add(firstItem);
            result.add(secondtItem);

        }
        if (firstList.size()>secondList.size()){
            result.addAll(firstList.subList(minSize,firstList.size()));
        }else {
            result.addAll(secondList.subList(minSize,secondList.size()));
        }
        System.out.println(result.toString().replaceAll("[\\[\\],]", ""));
    }
}
