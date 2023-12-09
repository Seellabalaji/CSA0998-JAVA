import java.util.Scanner;
public class CompositeNum {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the number of elements in the array: ");
int length = scanner.nextInt();
int[] numbers = new int[length];
System.out.println("Enter the elements of the array:");
for (int i = 0; i < length; i++) {
numbers[i] = scanner.nextInt();
}
int count = countCompositeNumbers(numbers);
System.out.println("Number of composite numbers in the array: " + count);
}
public static boolean isComposite(int num) {
if (num <= 1) {
return false;
}
for (int i = 2; i <= Math.sqrt(num); i++) {
if (num % i == 0) {
return true;
}
}
return false;
}
public static int countCompositeNumbers(int[] numbers) {
int count = 0;
for (int num : numbers) {
if (isComposite(num)) {
count++;
}
}
return count;
}
}
