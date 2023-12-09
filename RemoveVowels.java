import java.util.Scanner;
public class RemoveVowels {
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
System.out.print("Enter a string: ");
String inputString = s.nextLine();
String stringWithoutVowels = removeVowels(inputString);
System.out.println("String after removing vowels: " + stringWithoutVowels);
}
public static String removeVowels(String inputString) {
StringBuilder result = new StringBuilder();
for (int i = 0; i < inputString.length(); i++) {
char ch = inputString.charAt(i);
if (!isVowel(ch)) {
result.append(ch);
}
}
return result.toString();
}
public static boolean isVowel(char ch) {
ch = Character.toLowerCase(ch);
return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
}
}
