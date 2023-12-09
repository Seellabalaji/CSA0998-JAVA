import java.util.*;
class User
{
    String str1,str2;
    void id()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the str1:");
        str1=s.nextLine();
        System.out.println("Enetr teh str2:");
        str2=s.nextLine();
    }
    void cal()
    {
        if(str1.equals(str2))
        {
            System.out.println("User name is valid");
        }
        else{
            System.out.println("user name is invalid");
        }
    }
}
class displa{
        public static void main(String args[])
        {
            User o=new User();
            o.id();
            o.cal();
        }
    }