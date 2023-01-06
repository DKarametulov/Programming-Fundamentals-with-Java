package MethodsLab;

import java.util.Scanner;

public class calculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
      int area = printArea(width,height);
        System.out.println(area);
    }
    public static int printArea (int width,int height){
        return width * height;


    }
}
