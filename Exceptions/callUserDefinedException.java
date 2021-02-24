package Exceptions;
import java.util.Scanner;

public class callUserDefinedException{
    public static void main(String args[]){
        int grade; // 0- 100
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Grade: ");
            grade = input.nextInt();

            // exception
            if(grade <0 || grade >100){
                throw new userDefinedException();
            }
        } catch (userDefinedException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("try again.");
        }
    }
}