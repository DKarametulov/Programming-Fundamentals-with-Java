package listExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class softUniCoursePlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> lessonsList = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("course start")){
            String[] inputLine = command.split(":");
            String input = inputLine[0];

            switch (input){
                case "Add":
                    String addLesson = inputLine[1];
                    if (!lessonsList.contains(addLesson)) {
                        lessonsList.add(addLesson);
                    }
                    break;
                case "Insert":
                    String lessonInsert = inputLine[1];
                    int index = Integer.parseInt(inputLine[2]);
                    if (!lessonsList.contains(lessonInsert)) {
                        lessonsList.add(index, lessonInsert);
                    }
                    break;
                case "Remove":
                    String lessonsRemove = inputLine[1];
                    if (lessonsList.contains(lessonsRemove)) {
                        lessonsList.remove(lessonsRemove);
                    }
                    int indexLesson = lessonsList.indexOf(lessonsRemove);
                    if (lessonsList.get(indexLesson + 1).equals(lessonsRemove + "-Exercise")){
                        lessonsList.remove(indexLesson +1);
                    }
                    break;
                case "Swap":
                    String lessonsSwap1 = command.split(":")[1];
                    String lessonsSwap2 = command.split(":")[2];

                    if (lessonsList.contains(lessonsSwap1) && lessonsList.contains(lessonsSwap2)) {
                        int index1 = lessonsList.indexOf(lessonsSwap1);
                        int index2 = lessonsList.indexOf(lessonsSwap2);
                        lessonsList.set(index1, lessonsSwap2);
                        lessonsList.set(index2, lessonsSwap1);

                        String exOne = lessonsSwap1 + "-Exercise";
                        String exTwo = lessonsSwap2 + "-Exercise";

                        if (lessonsList.contains(exOne)){
                            lessonsList.remove(lessonsList.indexOf(exOne));
                            lessonsList.add(lessonsList.indexOf(lessonsSwap1 +1),exOne);
                        }
                        if (lessonsList.contains(exTwo)){
                            lessonsList.remove(lessonsList.indexOf(exTwo));
                                lessonsList.add(lessonsList.indexOf(lessonsSwap2) + 1,exTwo);
                            }
                        }

                    break;
                case "Exercise":
                    String lessonExercise = inputLine[1];
                    String exercise = lessonExercise + "-Exercise";
                    int indexLessonTitle = lessonsList.indexOf(lessonExercise);
                    if (lessonsList.contains(lessonExercise)){
                        if (indexLessonTitle == lessonsList.size() - 1){
                            lessonsList.add(indexLessonTitle +1,exercise);
                        } else if (!lessonsList.get(indexLessonTitle + 1).equals(exercise)) {
                            lessonsList.add(indexLessonTitle + 1,exercise);
                        }
                        }else {
                        lessonsList.add(lessonExercise);
                        lessonsList.add(exercise);
                    }
                    break;
            }




            command = scanner.nextLine();
        }
        printList(lessonsList);

    }
    private static void  printList(List<String> elements){
        int count = 1;
        for (String element : elements){
            System.out.println(count + "." + element);
            count++;
        }
    }
}
