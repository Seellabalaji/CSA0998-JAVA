import java.util.*;
class numberpattern5{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.print("Enter the number to be printed: ");
int m=s.nextInt();
System.out.print("Max number of time printed: ");
int n=s.nextInt();
int i,j;
for(i=1;i<=n;i++)
{
for(j=1;j<=i;j++)
{
System.out.print(" "+m);
}
System.out.print("\n");
}
for(i=n-1;i>=1;i--)
{
for(j=i;j>=1;j--)
{
System.out.print(" "+m);
}
System.out.print("\n");
}
}
}
