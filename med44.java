import java.util.*;
class med44{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.print("Enter the lower range: ");
int l= s.nextInt();
System.out.print("Enter the higher range: ");
int h= s.nextInt();
int len = h-l+1;
int out[][]=new int[len][2];
int num=l;
for(int i=0;i<len;i++)
{
out[i][0]=num;
out[i][1]=num*num;
num++;
}
System.out.print("Output : [");
for(int i=0;i<len;i++)
{
System.out.print("("+out[i][0]+","+out[i][1]+") ,");
}
System.out.print("]");
}
}