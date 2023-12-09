import java.util.Scanner;
public class CharSearch {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a string: ");
String inputString = scanner.nextLine();
System.out.print("Enter a character to search for: ");
char searchChar = scanner.next().charAt(0);
int index = findCharacter(inputString, searchChar);
if (index != -1) {
System.out.println("Character '" + searchChar + "' found at index: " + index);
} else {
System.out.println("Character '" + searchChar + "' not found in the string.");
}
}
public static int findCharacter(String inputString, char searchChar) {
for (int i = 0; i < inputString.length(); i++) {
if (inputString.charAt(i) == searchChar) {
return i;
}
}
return -1;
}
}
