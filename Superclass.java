import java.util.*;
class SuperClass {
    private int number;
    public SuperClass(int number) {
        this.number = number;
    }
    public void display() {
        System.out.println("SuperClass Number: " + number);
    }
}
class SubClass extends SuperClass {
    private int subNumber;
    public SubClass(int number, int subNumber) {
        super(number);
        this.subNumber = subNumber;
    }
    @Override
    public void display() {
        super.display();
        System.out.println("\nSubClass Number:" + subNumber);
    }
}
class cal
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number for SuperClass: ");
        int superNumber = scanner.nextInt();
        System.out.print("Enter the number for SubClass: ");
        int subNumber = scanner.nextInt();
        SubClass subObj = new SubClass(superNumber, subNumber);
        subObj.display();
    }
}