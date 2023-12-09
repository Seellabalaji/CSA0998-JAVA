import java.util.*;
class Circle
{
    float radius,p;
    void area() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the radius:");
        radius= s.nextFloat();
        System.out.println("Enter the p value:");
        p=s.nextFloat();
    }
    void cal()
    {
        float result = p*radius*radius;
        System.out.println("Area of circle=" +result);
    }
}
class cir
{
    public static void main(String []arg)
    {
        Circle obj=new Circle();
        obj.area();
        obj.cal();
    }
}