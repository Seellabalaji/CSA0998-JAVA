import java.util.*;
class numberpattern7{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int i,j,m=1;
for(i=1;i<=n;i++)
{
for(j=1;j<=i;j++)
{
System.out.print(m*m +"  ");
m++;
}
System.out.print("\n");
}
}
}
