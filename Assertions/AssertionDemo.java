package Assertions;
import java.util.Scanner;

// note that assert has to be enabled in project mode "-enableassertion"
// assertion is used in development testing, to assert your assumptions with your program
// assertion does not address runtime error of the program
public class AssertionDemo {
    public static void main(String args[]){
        int grade; // 0- 100
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Grade: ");
            grade = input.nextInt();

            // assert - assert grade >= 0 && grade<= 100, returns true of false
            assert grade >= 0 && grade<= 100: "invalid grade"; // returns with error message
           
        } catch (AssertionError e) { // note that there is no AssertionException, only Assertion Error
            System.out.println(e.getMessage());
        } finally {
            System.out.println("try again.");
        }
    }
}
