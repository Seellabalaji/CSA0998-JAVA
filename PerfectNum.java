import java.util.Scanner;
public class PerfectNum {
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
System.out.print("Enter a number: ");
int num = s.nextInt();
if (isPerfectNumber(num)) {
System.out.println(num + " is a perfect number.");
} else {
System.out.println(num + " is not a perfect number.");
}
}
public static boolean isPerfectNumber(int num) {
if (num <= 1) {
return false;
}
int sum = 1;
for (int i = 2; i * i <= num; i++) {
if (num % i == 0) {
sum += i;
if (i * i != num) {
sum += num / i;
}
}
}
return sum == num;
}
}
