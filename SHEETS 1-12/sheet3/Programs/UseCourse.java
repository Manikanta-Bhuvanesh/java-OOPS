import java.util.Scanner;
public class UseCourse{
  public static void main(String[] args)
  {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the department of the course: ");
      String dept = sc.nextLine();
      System.out.print("Enter the number of the courses ");
      int number = sc.nextInt();
      System.out.print("Enter the credit hours of the courses ");
      int hours = sc.nextInt();
      if(dept.equals("BIO") || dept.equals("CHM")|| dept.equals("CIS") || dept.equals("PHY"))
      {
          LabCourse l = new LabCourse(dept, number, hours);
          l.display();
      }
      else
      {
          CollegeCourse c = new CollegeCourse(dept, number, hours);
          c.display();
      }
  }

}