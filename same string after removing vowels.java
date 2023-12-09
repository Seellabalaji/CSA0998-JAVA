import java.util.Scanner;
public class RemoveVowels {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter a string:");
String input = sc.nextLine();
System.out.print("The string without vowels is: ");
for (int i=0;i<input.length();i++)
{
char ch = input.charAt(i);
if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
{
continue;
}
else
{
System.out.print(ch);
}
}
}
}
