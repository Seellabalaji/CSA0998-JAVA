import java.util.*;
class Rectangle1
{
    int height,width;
    void area() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the height:");
        height = s.nextInt();
        System.out.println("Enter the width:");
        width = s.nextInt();
    }
    void cal()
    {
        int result = height* width;
        System.out.println("Area of rectangle=" +result);
    }
}
class rect
{
    public static void main(String []arg)
{
    Rectangle1 obj=new Rectangle1();
    obj.area();
    obj.cal();
}
}
