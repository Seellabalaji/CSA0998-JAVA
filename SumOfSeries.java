import java.util.*;
public class SumOfSeries
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System .in);
        int a,i,sum=0;
        System.out.println("Enter the Number:");
        a=s.nextInt();
        for(i=1;i<=a;i++)
        {
            sum=sum+i;
        }
        System.out.println("Sum upto Given Number is:"+sum);
    }
}
