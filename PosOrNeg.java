import java.util.*;
class PosOrNeg
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System .in);
        int y;
        System.out.println("Enter Any Number:");
        y=s.nextInt();
        if(y>0)
        {
            System.out.println(y+" is a positive number");
        }
        else if (y==0)
        {
            System.out.println(y+" is a zero");
        }
        else
        {
            System.out.println(y+" is a Negitive nember");
        }
    }
}