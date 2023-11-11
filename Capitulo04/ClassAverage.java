package Capitulo04;

import java.util.Scanner;

public class ClassAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float total = 0;
        int gradeCounter = 1;

        while (gradeCounter <= 10) {
            System.out.printf("Enter grade %d: ", gradeCounter);
            float grade = input.nextFloat();
            total += grade;
            gradeCounter++;
        }

        float average = total / 10;

        System.out.printf("%nTotal of all 10 grades is: %.2f%n", total);
        System.out.printf("Class average is: %.2f", average);
    }
}
