import java.util.Scanner;
public class Printvowelsconst {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a word: ");
String word = scanner.nextLine().toLowerCase();
separateVowelsConsonants(word);
}
public static void separateVowelsConsonants(String word) {
StringBuilder vowels = new StringBuilder();
StringBuilder consonants = new StringBuilder();
for (int i = 0; i < word.length(); i++) {
char ch = word.charAt(i);
if (isVowel(ch)) {
vowels.append(ch).append(" ");
} else if (Character.isLetter(ch)) {
consonants.append(ch).append(" ");
}
}
System.out.println("Vowels in the word: " + vowels);
System.out.println("Consonants in the word: " + consonants);
}
public static boolean isVowel(char ch) {
return "aeiou".indexOf(ch) != -1;
}
}
