import java.util.Scanner;
public class Username {
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
System.out.print("Enter a username: ");
String username1 = s.nextLine();
System.out.print("Enter a username again: ");
String username2 = s.nextLine();
if(username1.equals(username2))
{
System.out.println("Username is Valid");
}
else
System.out.println("Username is Invalid");
}
}