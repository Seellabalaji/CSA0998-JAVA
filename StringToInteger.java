import java.util.Scanner;
public class StringToInteger {
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
System.out.print("Enter a number as a string: ");
String input = s.nextLine();
int convertedNumber = convert(input);
System.out.println("Converted number: " + convertedNumber);
s.close();
}
public static int convert(String input) {
int result = 0;
boolean isNegative = false;
int startIndex = 0;
if (input.charAt(0) == '-') {
isNegative = true;
startIndex = 1;
}
for (int i = startIndex; i < input.length(); i++) {
char c = input.charAt(i);

if (c >= '0' && c <= '9') {
int digitValue = c - '0';
result = result * 10 + digitValue;
} else {
System.out.println("Invalid character found: " + c);
return 0;
}
}
if (isNegative) {
result = -result;
}
return result;
}
}
