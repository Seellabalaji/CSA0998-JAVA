import java.util.Scanner;

public class NumberTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number to be printed: ");
        int number = scanner.nextInt();

        System.out.print("Max Number of times printed: ");
        int maxTimes = scanner.nextInt();

        printNumberPattern(number, maxTimes);

        scanner.close();
    }

    public static void printNumberPattern(int number, int maxTimes) {
        for (int i = 1; i <= maxTimes * 2 - 1; i++) {
            int times = (i <= maxTimes) ? i : (maxTimes * 2 - i);

            for (int j = 1; j <= times; j++) {
                System.out.print(number);
            }

            System.out.println();
        }
    }
}
