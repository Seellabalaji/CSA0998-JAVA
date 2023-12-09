import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the grade of the employee (A/B): ");
        char grade = s.nextLine().charAt(0);

        System.out.print("Enter the employee salary: ");
        double salary = s.nextDouble();

        double bonus = 0;
        if (salary < 10000) {
            bonus += 0.02 * salary;
        }

        if (grade == 'A') {
            bonus += 0.05 * salary;
        } else if (grade == 'B') {
            bonus += 0.1 * salary;
        }

        double totalSalary = salary + bonus;

        System.out.println("Salary=" + salary);
        System.out.println("Bonus=" + bonus);
        System.out.println("Total to be paid: " + totalSalary);

    }
}
