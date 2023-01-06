package MethodsLab;

import java.util.Scanner;

public class repeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String text = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());
        System.out.println(printRepeatText(text,n));
    }

    public static String printRepeatText(String text, int n) {
        String result = "";

        for (int i = 1; i <= n; i++) {
            result += text;
        }
        return result;
    }
}
