import java.util.*;
class invertedpyramid{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int i,j;
for(i=n;i>=1;i--)
{
for(j=n;j>=i;j--)
{
System.out.print(" ");
}
for(j=i;j>=1;j--)
{
System.out.print(" *");
}
System.out.print("\n");
}
}
}
