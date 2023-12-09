import java.util.*;
class numberpattern6{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int i,j;
for(i=0;i<=n;i++)
{
for(j=i;j<n;j++)
{
System.out.print(" ");
}
int num=1;
for(j=0;j<=i;j++)
{
System.out.print(" "+num);
num=num* (i-j) / (j+1);
}
System.out.print("\n");
}
}
}