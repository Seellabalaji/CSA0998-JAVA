import java.util.*;
class m4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose an option:");
        System.out.println("1. Check if a string is palindrome");
        System.out.println("2. Check if a number is palindrome");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter a string:");
                String str = sc.next();

                // Check if the string is a palindrome without using StringBuilder
                boolean isPalindrome = true;
                int length = str.length();

                for (int i = 0; i < length / 2; i++) {
                    if (str.charAt(i) != str.charAt(length - 1 - i)) {
                        isPalindrome = false;
                        break;
                    }
                }

                if (isPalindrome) {
                    System.out.println("Palindrome");
                } else {
                    System.out.println("Not a Palindrome");
                }
                break;

            case 2:
                System.out.println("Enter a number:");
                int num = sc.nextInt();
                int originalNum = num;
                int reversedNum = 0;
                while (num != 0) {
                    int digit = num % 10;
                    reversedNum = reversedNum * 10 + digit;
                    num /= 10;
                }
                if (originalNum == reversedNum) {
                    System.out.println("Palindrome");
                } else {
                    System.out.println("Not a Palindrome");
                }
                break;

            default:
                System.out.println("Invalid choice");
        }

    }
}