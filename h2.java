import java.util.*;
class h2
{
    public static void main(String[] args)
    {
        int Total_users=0,staff_users=0,nt_users=0,student_users=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Total Users:");
        Total_users = sc.nextInt();
        System.out.println("Enter the Staff Users:");
        staff_users = sc.nextInt();
        if(Total_users==staff_users || Total_users<staff_users ||Total_users<=0 ||staff_users<=0)
        {
            System.out.println("Invalid input");
        }
        else
        {
            nt_users=staff_users/3;
            student_users=Total_users-(staff_users+nt_users);
            System.out.println("Student Users are:"+student_users);
        }
    }
}