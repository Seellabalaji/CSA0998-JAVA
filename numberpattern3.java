import java.util.*;
class numberpattern3{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int i,j;
for(i=1;i<=n;i++)
{
for(j=i;j<=n;j++)
{
System.out.print(" ");
}
for(j=1;j<=i;j++)
{
System.out.print(" "+i);
}
System.out.print("\n");
}
for(i=n-1;i>=1;i--)
{
for(j=n;j>=i;j--)
{
System.out.print(" ");
}
for(j=i;j>=1;j--)
{
System.out.print(" "+i);
}
System.out.print("\n");
}
}
}
