import java.util.Scanner;
class Factors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scanner.nextInt();
        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("N should be a positive integer.");
            return;
        }
        int[] factors = new int[100];
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors[count] = i;
                count++;
            }
        }
        System.out.println("Number of factors = " + count);
        if (n <= count) {
            System.out.println(n + "th factor of " + num + " = " + factors[n - 1]);
        } else {
            System.out.println("N is greater than the number of factors.");
        }
    }
}