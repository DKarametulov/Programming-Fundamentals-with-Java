package Artical.Articles;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        String title = command.split("\\,")[0];
        String content = command.split("\\,")[1];
        String author = command.split("\\,")[2];

      Articles articles = new Articles(title,content,author);


        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= number ; i++) {
            String input = scanner.nextLine();
            String commandName = input.split("\\:")[0];
            String newValue = input.split("\\:")[1];

            switch (commandName) {
                case "Edit":
                    articles.edit(newValue);
                    break;
                case "ChangeAuthor":
                    articles.changeAuthor(newValue);
                    break;
                case "Rename":
                    articles.rename(newValue);
                    break;

            }
        }

        System.out.println(articles.toString());

        }
    }

