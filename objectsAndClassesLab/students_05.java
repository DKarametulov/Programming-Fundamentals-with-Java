package objectsAndClassesLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class students_05 {

    static class Student {
        private  String firstName;
       private String lastName;
        private int age;
        private String homeTown;

        public Student(String firstName, String lastName, int age, String homeTown) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.homeTown = homeTown;
        }

        public String getFirstName() {
            return this.firstName;
        }
        public String getLastName(){
            return this.firstName;
        }

        public int getAge() {
            return this.age;
        }

        public String getHomeTown() {
            return this.homeTown;
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        List<Student> studentsList = new ArrayList<>();
        while (!command.equals("end")) {
            String[] studentData = command.split(" ");
            String firstName = studentData[0];
            String lastName = studentData[1];
            int age = Integer.parseInt(studentData[2]);
            String homeTown = studentData[3];
            Student currentStudent = new Student(firstName, lastName, age, homeTown);

            studentsList.add(currentStudent);

            command = scanner.nextLine();
        }
        String city = scanner.nextLine();

        for (Student student : studentsList) {
            if (student.getHomeTown().equals(city)) {


                System.out.printf("%s %s is %d years old%n", student.getFirstName(), student.lastName, student.getAge());
            }

        }
    }
}
