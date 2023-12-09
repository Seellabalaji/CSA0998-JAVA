import java.util.*;
class CharacterCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter * to exit...");

        int lowercaseCount = 0;
        int uppercaseCount = 0;
        int numberCount = 0;

        char inputChar;

        do {
            System.out.print("Enter any character: ");
            inputChar = scanner.next().charAt(0);

            if (Character.isLowerCase(inputChar)) {
                lowercaseCount++;
            } else if (Character.isUpperCase(inputChar)) {
                uppercaseCount++;
            } else if (Character.isDigit(inputChar)) {
                numberCount++;
            }

        } while (inputChar != '*');

        System.out.println("Total count of lower case: " + lowercaseCount);
        System.out.println("Total count of upper case: " + uppercaseCount);
        System.out.println("Total count of numbers: " + numberCount);

        scanner.close();
    }
}
