package MapsLambdaandStreamAPIExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class aMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String resource = scanner.nextLine();
        Map<String, Integer> resourcesQuantity = new LinkedHashMap<>();



        while (!resource.equals("stop")){
            int quantity = Integer.parseInt(scanner.nextLine());
            if (!resourcesQuantity.containsKey(resource)){
                resourcesQuantity.put(resource, quantity);
            }else {
                resourcesQuantity.put(resource, resourcesQuantity.get(resource) + quantity);
            }

            resource = scanner.nextLine();

        }
        resourcesQuantity.forEach((k, v) -> System.out.println(k+ " -> " + v));

        }

    }

