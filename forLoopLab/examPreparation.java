package forLoopLab;

import java.util.Scanner;

public class examPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int badGrades = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        double avgScore = 0;
        int numberOfProblems = 0;
        String lastProblem = "";
        int countBadGrades = 0;


        boolean needBreak = false;

        while (!command.equals("Enough")){

            String currentProblem = command;
            double grade = Double.parseDouble(scanner.nextLine());
            lastProblem = currentProblem;
            numberOfProblems++;



            if (grade <= 4){
                countBadGrades++;
            }

            avgScore += grade;

            if (countBadGrades >= badGrades){
                needBreak = true;
                break;
            }

            command = scanner.nextLine();
        }
        if (needBreak){
            System.out.printf("You need a break, %d poor grades.",countBadGrades);
        }
        else {
            System.out.printf("Average score: %.2f%n",avgScore / numberOfProblems);
            System.out.printf("Number of problems: %d%n",numberOfProblems);
            System.out.printf("Last problem: %s",lastProblem);
        }

    }
}
