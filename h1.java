import java.util.*;
class Daysconverter
{
    public static void main(String args[])
    {
        try
        {
            int years=0,weeks=0,days=0;
            int rem1=0,rem2=0;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number of days:");
            days=sc.nextInt();
            if(days>0)
            {
                years=days/365;
                rem1=days%365;
                weeks=rem1/7;
                rem2=rem1%7;
                System.out.println("No. of Years:"+years);
                System.out.println("No. of weeks:"+weeks);
                System.out.println("No. of Days:"+rem2);
            }
            else
            {
                System.out.println("Please Enter positive value only!");
            }
        }
catch (Exception e)
        {
            System.out.println("Please Enter integer value only!");
        }
    }
}