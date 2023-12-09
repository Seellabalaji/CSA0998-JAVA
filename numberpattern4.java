import java.util.*;
class numberpattern4{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.print("Enter the number of rows: ");
int n=s.nextInt();
int i,j;
for(i=1;i<=n;i++)
{
for(j=1;j<=i;j++)
{
System.out.print(" "+i);
}
System.out.print("\n");
}
for(i=n-1;i>=1;i--)
{
for(j=i;j>=1;j--)
{
System.out.print(" "+i);
}
System.out.print("\n");
}
}
}
