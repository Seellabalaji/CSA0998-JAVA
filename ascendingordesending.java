import java.util.*;
public class ascendingordesending {
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
System.out.println("Enter number of strings to enter:");
int n= s.nextInt();
String arr[]= new String[n];
String temp;
System.out.println("Enter the strings :");
for(int i=0;i<n;i++) {
arr[i] = s.next();
}
System.out.print("Order(A/D): ");
char ch = s.next().charAt(0);
if (ch=='A') {
for(int i=0;i<n-1;i++){
for(int j=i+1;j<n;j++){
if(arr[i].compareTo(arr[j])>0){
temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
}
}
} 
else if (ch=='D') {
for(int i=0;i<n-1;i++){
for(int j=i+1;j<n;j++){
if(arr[i].compareTo(arr[j])<0){
temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
}
}
} 
else {
System.out.println("Invalid choice! Enter 'A' for ascending or 'D' for descending.");
return;
}
for (int i=0;i<n;i++) {
System.out.println(arr[i]+""+"\n");
}
}
}
