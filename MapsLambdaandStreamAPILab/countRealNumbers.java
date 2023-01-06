package MapsLambdaandStreamAPILab;

import java.util.*;

public class countRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numbersArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToDouble(Double::parseDouble).toArray();

        TreeMap<Double, Integer> countNumbers = new TreeMap<>();

        for (double currentNum : numbersArr){
            Integer  currentValue = countNumbers.get(currentNum);
            if (countNumbers.containsKey(currentNum)){
                countNumbers.put(currentNum, currentValue + 1);
            }else {
                countNumbers.put(currentNum, 1);
            }
        }
        for (Map.Entry<Double, Integer> entry : countNumbers.entrySet()) {
            System.out.printf("%.0f -> %d%n", entry.getKey(), entry.getValue());
        }


    }
}
