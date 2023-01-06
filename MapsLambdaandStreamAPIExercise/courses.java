package MapsLambdaandStreamAPIExercise;

import java.util.*;

public class courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        Map<String, List<String>> courses = new LinkedHashMap<>();


        while (!command.equals("end")) {
            String courseName = command.split(" : ")[0];
            String studentName = command.split(" : ")[1];

            if (!courses.containsKey(courseName)) {
                courses.put(courseName, new ArrayList<>());


            }
            courses.get(courseName).add(studentName);
            command = scanner.nextLine();
        }
        courses.entrySet()
                .forEach(entry -> {
                    System.out.println(entry.getKey() + ": " + entry.getValue().size());
                    entry.getValue().forEach(studentName -> System.out.println("-- " + studentName));
                });

    }


}

