import java.util.*;
class common{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.print("Enter the size of first array: ");
int x=s.nextInt();
int a[]=new int[x];
System.out.println("Enter the elements of first array: ");
for(int i=0;i<x;i++)
{
a[i]= s.nextInt();
}
System.out.print("Enter the size of second array: ");
int y=s.nextInt();
int b[]=new int[y];
System.out.println("Enter the elements of second array: ");
for(int i=0;i<y;i++)
{
b[i]= s.nextInt();
}
int k=0;
int out[]=new int[x];
for(int i=0;i<x;i++)
{
for(int j=0;j<x;j++)
{
if(a[i]==b[j])
{
out[k]=a[i];
k++;
}
}
}
System.out.print("Output: [");
for(int i=0;i<k;i++)
{
System.out.print(out[i]+",");
}
System.out.print("]");
}
}
