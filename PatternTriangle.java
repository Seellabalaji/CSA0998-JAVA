import java.util.Scanner;

public class PatternTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" "); // Print spaces based on the position
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* "); // Print stars based on the position
            }
            System.out.println();
        }

        scanner.close();
    }
}
