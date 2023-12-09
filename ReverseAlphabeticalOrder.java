import java.util.Arrays;
import java.util.Scanner;
public class ReverseAlphabeticalOrder {
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
System.out.print("Enter a word: ");
String word = s.nextLine();
String reversedWord = sortInReverseAlphabeticalOrder(word);
System.out.println("Word in reverse alphabetical order: " + reversedWord);
}
public static String sortInReverseAlphabeticalOrder(String word) {
char[] chars = word.toCharArray();
Arrays.sort(chars);
for (int i = 0; i < chars.length / 2; i++) {
char temp = chars[i];
chars[i] = chars[chars.length - 1 - i];
chars[chars.length - 1 - i] = temp;
}
return new String(chars);
}
}
