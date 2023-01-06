package MapsLambdaandStreamAPIExercise;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class countCharsInaString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        Map<Character, Integer> symbolCount = new LinkedHashMap<>();

        for (char symbol : text.toCharArray()){
            if (symbol == ' '){
                continue;
            }
            if (!symbolCount.containsKey(symbol)){
                symbolCount.put(symbol, 1);
            }else {
                int currentCont = symbolCount.get(symbol);
                symbolCount.put(symbol,currentCont +1);
            }
        }
        for (Map.Entry<Character, Integer> entry : symbolCount.entrySet()) {
            System.out.println(entry.getKey()+ " -> " + entry.getValue() );
        }


    }
}
