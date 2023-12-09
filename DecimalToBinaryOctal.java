import java.util.Scanner;

public class DecimalToBinaryOctal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int decimalNumber = scanner.nextInt();

        String binaryNumber = convertToBinary(decimalNumber);
        String octalNumber = convertToOctal(decimalNumber);

        System.out.println("Binary Number = " + binaryNumber);
        System.out.println("Octal Number = " + octalNumber);
    }

    private static String convertToBinary(int decimalNumber) {
        return Integer.toBinaryString(decimalNumber);
    }

    private static String convertToOctal(int decimalNumber) {
        return Integer.toOctalString(decimalNumber);
    }
}
