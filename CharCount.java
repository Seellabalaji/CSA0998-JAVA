import java.util.Scanner;
public class CharCount {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a line: ");
String line = scanner.nextLine();
int CharCount = 0;
System.out.println("Special characters in the line:");
for (int i = 0; i < line.length(); i++) {
char ch = line.charAt(i);
if (!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)) {
System.out.println(ch);
CharCount++;
}
}
System.out.println("Number of special characters: " + CharCount);
}
}
