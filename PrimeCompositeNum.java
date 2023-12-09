import java.util.*;
class PrimeCompositeNum {
public static void main(String[] args){
int n;
int[] A = new int[50];
int primecount=0,compcount=0;
Scanner s=new Scanner(System.in);
System.out.println("Enter the size of array:");
n = s.nextInt();
System.out.println("Enter the numbers:");
for(int i=0;i<n;i++){
A[i] = s.nextInt();
}
for(int i=0;i<n;i++){
for(int j=2;j<A[i]-1;j++){
if(A[i]%j==0){
compcount++;
break;
}
else{
primecount++;
break;
}
}
}
System.out.println("Number of Prime numbers are:"+primecount);
System.out.println("Number of Composite numbers are:"+compcount);
}
}
