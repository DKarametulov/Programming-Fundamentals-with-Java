package OrderByAge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        List<Person> personList = new ArrayList<>();

        while (!command.equals("End")){
            String name = command.split(" ")[0];
            String id = command.split(" ")[1];
            int age = Integer.parseInt(command.split(" ")[2]);

            Person person = new Person(name, id, age);
            personList.add(person);

            command = scanner.nextLine();
        }
        personList.sort(Comparator.comparing(Person::getAge));
        for (Person person : personList){
            System.out.println(person);
        }
    }
}
