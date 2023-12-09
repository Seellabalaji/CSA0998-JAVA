import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the marks in Python: ");
        int python = s.nextInt();

        System.out.print("Enter the marks in C programming: ");
        int cProgramming = s.nextInt();

        System.out.print("Enter the marks in Mathematics: ");
        int mathematics = s.nextInt();

        System.out.print("Enter the marks in Physics: ");
        int physics = s.nextInt();

        int total = python + cProgramming + mathematics + physics;
        double aggregate = total / 4.0;

        System.out.println("Total= " + total);
        System.out.println("Aggregate = " + aggregate);

        if (aggregate > 75) {
            System.out.println("DISTINCTION");
        } else if (aggregate >= 60 && aggregate < 75) {
            System.out.println("First Division");
        } else if (aggregate >= 50 && aggregate < 60) {
            System.out.println("Second Division");
        } else if (aggregate >= 40 && aggregate < 50) {
            System.out.println("Third Division");
        } else {
            System.out.println("Fail");
        }

    }
}
