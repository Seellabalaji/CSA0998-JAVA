import java.util.Scanner;

public class SkipNumbers {
    public static void printSkippedNumbers(int start, int end, int skip) {
        int current = start;
        while (current <= end) {
            System.out.print(current + ", ");
            current += skip+1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the starting number (M): ");
        int M = scanner.nextInt();

        System.out.print("Enter the ending number (N): ");
        int N = scanner.nextInt();

        System.out.print("Enter the number of elements to skip (K): ");
        int K = scanner.nextInt();

        printSkippedNumbers(M, N, K);

        scanner.close();
    }
}
