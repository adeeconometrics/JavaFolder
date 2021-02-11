/**
 * @author: Dave Arthur D. Amiana
 * Description: sets and gets the name of Student class
 * note that this can be extended for Teacher class.
 */

 package School;
 import java.util.Scanner;

public class Main extends Student{
  public static void main(String[] args) {
      Student student_1 = new Student();
      Scanner input = new Scanner(System.in);

      System.out.print("enter name of student: ");
      student_1.setName(input.nextLine());

      System.out.print("enter age of student: ");
      student_1.setAge(input.nextInt());

      System.out.print("enter gender of student: ");
      student_1.setGender(input.nextLine()); // resolve problem with reading the gender
      
      System.out.print("enter "+student_1.name+"'s grade: ");
      student_1.setGrade(input.nextFloat());
      // display student's name, age, gender and grade
      
      System.out.println("\n");
      System.out.println("name of student: "+student_1.getName());
      System.out.println("age of student: "+student_1.getAge());
      System.out.println("gender of student: "+student_1.getGender());
      System.out.println("grade of student: "+student_1.getGrade());

  }
}