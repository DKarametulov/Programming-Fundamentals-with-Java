package MapsLambdaandStreamAPIExercise;

import java.util.*;

public class studentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> academy = new LinkedHashMap<>();
        for (int i = 1; i <= n; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if (!academy.containsKey(name)) {
                academy.put(name, new ArrayList<>());

            }
            academy.get(name).add(grade);
        }
            Map<String, Double> averageGrade = new LinkedHashMap<>();
            for (Map.Entry<String, List<Double>> entry : academy.entrySet()) {
                String student = entry.getKey();
                List<Double> listGrade = entry.getValue();
                double avgGrade = getAverageGrade(listGrade);
                if (avgGrade >= 4.50){
                    averageGrade.put(student, avgGrade);
                }
            }
            averageGrade.entrySet().forEach(entry -> System.out.printf("%s -> %.2f%n",entry.getKey(),entry.getValue()));
        }



    public static double getAverageGrade(List<Double> listGrade) {
        double sum = 0;
        for (double grade : listGrade) {
            sum += grade;
        }
        return sum / listGrade.size();
    }
}

