package ListsLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class listManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            List<String> commandLine = Arrays.stream(command.split(" "))
                    .collect(Collectors.toList());
            String input = commandLine.get(0);

            switch (input) {
                case "Contains":

                    int numberContains = Integer.parseInt(commandLine.get(1));
                    if (numbersList.contains(numberContains)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    String secondCommand = commandLine.get(1);
                    if (secondCommand.equals("even")) {
                        List<Integer> evenNumList = getEvenNumbers(numbersList);
                        System.out.println(evenNumList.toString().replaceAll("[\\[\\],]", ""));

                    } else {
                        List<Integer> oddNumList = getOddNumbers(numbersList);
                        System.out.println(oddNumList.toString().replaceAll("[\\[\\],]", ""));

                    }
                    break;
                case "Get":
                    int sum = 0;
                    for (int i = 0; i < numbersList.size(); i++) {
                        sum += numbersList.get(i);

                    }
                    System.out.println(sum);

                    break;
                case "Filter":
                    String condition = commandLine.get(1);
                    int number = Integer.parseInt(commandLine.get(2));
                    List<Integer> conditionNumList = getConditionNumber(numbersList,condition,number);
                    System.out.println(conditionNumList.toString().replaceAll("[\\[\\],]",""));

                    break;
            }

            command = scanner.nextLine();
        }

    }

    public static List<Integer> getEvenNumbers(List<Integer> initList) {
        List<Integer> evenNumbersList = new ArrayList<>();

        for (int i = 0; i < initList.size(); i++) {
            int currentItem = initList.get(i);

            if (currentItem % 2 == 0) {
                evenNumbersList.add(currentItem);
            }

        }
        return evenNumbersList;
    }

    public static List<Integer> getOddNumbers(List<Integer> initList) {
        List<Integer> oddNumbersList = new ArrayList<>();

        for (int i = 0; i < initList.size(); i++) {
            int currentItem = initList.get(i);

            if (currentItem % 2 != 0) {
                oddNumbersList.add(currentItem);
            }

        }
        return oddNumbersList;
    }

    public static List<Integer> getConditionNumber(List<Integer> initList, String condition, int number) {
        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < initList.size(); i++) {
            int currentNum = initList.get(i);

            if (condition.equals("<")) {
                if (currentNum < number) {
                    resultList.add(currentNum);
                }
            } else if (condition.equals(">")) {
                if (currentNum > number) {
                    resultList.add(currentNum);
                }

            } else if (condition.equals("<=")) {
                if (currentNum <= number) {
                    resultList.add(currentNum);
                }
            } else if (condition.equals(">=")) {
                if (currentNum >= number) {
                    resultList.add(currentNum);
                }
            }

        }
        return resultList;
    }

}
