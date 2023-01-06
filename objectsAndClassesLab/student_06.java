package objectsAndClassesLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class student_06 {
    static class Student {
        private String firstName;
        private String lastName;
        private int age;
        private String town;

        public Student (String firstName,String lastName,int age, String town){
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.town = town;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setTown(String town) {
            this.town = town;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public int getAge() {
            return age;
        }

        public String getTown() {
            return town;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> students = new ArrayList<>();

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] input = command.split(" ");

            String firstName = input[0];
            String lastName = input[1];
            int age = Integer.parseInt(input[2]);
            String town = input[3];

            if (isExisting(students,firstName,lastName)){
                Student student = getStudent(students,firstName,lastName,age,town);
            }else {
                Student student = new Student(firstName, lastName, age, town);

              students.add(student);
            }



            command = scanner.nextLine();
        }
        String town = scanner.nextLine();
        students.stream().filter(s -> s.getTown().equals(town)).forEach(s -> System.out.println(String.format("%s %s is %d years old", s.firstName, s.lastName, s.age)));

            }



   private static boolean isExisting(List<Student> students, String firstName, String lastName ) {
        for (Student student : students ){
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)){
                return true;
            }
        }
        return false;
    }
    private static Student getStudent (List<Student> students, String firstName, String lastName, int age, String town){
        Student existingStudent = null;
        for (Student student : students){
            if (student.getFirstName().equals(firstName)&& student.lastName.equals(lastName)){
                existingStudent = student;
                existingStudent.age = age;
                existingStudent.town = town;
            }
        }
        return  existingStudent;
    }
}