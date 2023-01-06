package MapsLambdaandStreamAPIExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class legendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> items = new LinkedHashMap<>();
        items.put("shards", 0);
        items.put("fragments", 0);
        items.put("motes", 0);

        Map<String, Integer> junksItems = new LinkedHashMap<>();
        boolean isWin = false;

        while (!isWin) {
            String input = scanner.nextLine();
            String[] inputData = input.split(" ");

            for (int index = 0; index <= inputData.length - 1; index += 2) {
                int quantity = Integer.parseInt(inputData[index]);
                String material = inputData[index + 1].toLowerCase();

                if (material.equals("shards") || material.equals("fragments") || material.equals("motes")) {
                    int currentQuantity = items.get(material);
                    items.put(material, currentQuantity + quantity);

                } else {
                    if (!junksItems.containsKey(material)) {
                        junksItems.put(material, quantity);

                    } else {
                        int current = junksItems.get(material);
                        junksItems.put(material, current + quantity);
                    }

                }
                if (items.get("shards") >= 250) {
                    System.out.println("Shadowmourne obtained!");
                    items.put("shards", items.get("shards") - 250);
                    isWin = true;
                    break;
                } else if (items.get("fragments") >= 250) {
                    System.out.println("Valanyr obtained!");
                    items.put("fragments", items.get("fragments") - 250);
                    isWin = true;
                    break;

                } else if (items.get("motes") >= 250) {
                    System.out.println("Dragonwrath obtained!");
                    items.put("motes", items.get("motes") - 250);
                    isWin = true;
                    break;

                }
            }
            if (isWin) {
                break;
            }
        }
        items.entrySet()
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
        junksItems.entrySet()
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
    }
}
