import java.util.*;
 class average{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int i;
        int sum=0,avg;
        int a[]=new int[5];
        System.out.println("Enter the marks ");
        for(i=0;i<a.length;i++)
        {

            a[i]=s.nextInt();
            sum=sum+a[i];
        }
        avg=sum/ a.length;
        System.out.println("sum is = " +sum);
        System.out.println("average is ="+avg);
    }
}