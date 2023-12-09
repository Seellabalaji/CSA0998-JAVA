import java.util.*;
class duplicate{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.print("Enter the number of elements: ");
int n=s.nextInt();
int arr[] = new int[n];
for(int i=0;i<n;i++)
{
System.out.print("Enter element"+(i+1)+": ");
arr[i]=s.nextInt();
}
for(int i=0;i<n;i++)
{
for(int j=i+1;j<n;j++)
{
if(arr[i]==arr[j])
{
for(int k=j;k<n-1;k++)
{
arr[k] = arr[k+1];
}
n--;
j--;
}
}
}
System.out.print("Non-duplicate items: [");
for(int i=0;i<n;i++)
{
System.out.print(arr[i]+",");
}
System.out.print("]");
}
}
