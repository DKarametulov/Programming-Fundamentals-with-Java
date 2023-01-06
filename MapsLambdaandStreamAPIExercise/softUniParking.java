package MapsLambdaandStreamAPIExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class softUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, String> cars = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String[] commandLine = input.split(" ");
            String command = commandLine[0];
            String name = commandLine[1];


            switch (command){
                case "register":
                    String numberPlate = commandLine[2];
                    if (!cars.containsKey(name)){
                        cars.put(name, numberPlate);
                        System.out.printf("%s registered %s successfully%n",name,numberPlate);
                    }else {
                        System.out.printf("ERROR: already registered with plate number %s%n",numberPlate);
                    }


                    break;
                case "unregister":
                    if (!cars.containsKey(name)){

                        System.out.printf("ERROR: user %s not found%n",name);
                    }else {
                            cars.remove(name);
                            System.out.printf("%s unregistered successfully%n",name);

                    }
                    break;
            }
        }
        for (Map.Entry<String, String> entry : cars.entrySet()) {
            System.out.printf("%s => %s%n",entry.getKey(), entry.getValue());
        }


    }
}
