import java.util.Scanner;
class reverseword {
public static void main(String[] args) {
String word,rev="";
Scanner s = new Scanner(System.in);
System.out.print("Enter a word: ");
word = s.nextLine();
int len = word.length();
for(int i=len-1;i>=0;i--)
{
rev=rev+word.charAt(i);
}
System.out.println("Reversed Word="+rev);
}
}
