/** 
 * @author Dave Amiana
 * Description: computes Student's average. 
*/

import java.util.Scanner;

public class Students{
    public static void main(String [] args){
        // declare variables
        int students=0, subj_num=0;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter number of students: ");
        students = input.nextInt();
        System.out.print("Enter number of subjects: ");
        subj_num = input.nextInt();
        
        Object[][] std_arr = new Object[students][subj_num];
        
        // input
        for(int i=0; i<std_arr.length; i++){
            System.out.print("Enter name of student: ");
            std_arr[i][0] = new String(input.next());
            
            for(int j = 0; j<std_arr[i].length; j++){
                if(j!=0&&i>=0){
                    System.out.print("Enter grades: ");
                    std_arr[i][j] =  input.nextInt();
                }
            }
            System.out.println();
        }
        
        // output
        for(int row=0; row<std_arr.length; row++){
            // accumulator variable
            int total = 0;
            // print names 
            System.out.print(std_arr[row][0]+"'s grades: [");
            for(int col=0; col<std_arr[row].length; col++){
                // print grades
                if(col!=0&&row>=0){
                    System.out.print(std_arr[row][col]+" ");
                    total= total + (int)std_arr[row][col];
                }
            }
            System.out.println("]");
            // get the average by dividing total/(length-1)
            System.out.println(std_arr[row][0]+"'s average: "+(float)total/(std_arr[0].length-1));
            
        }
    }
}


