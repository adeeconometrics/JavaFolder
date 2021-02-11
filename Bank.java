/**
 * @author Dave Amiana
 * Description: a program the computes compound interest via nested for-loops.
 */
import java.util.Scanner;

public class Bank{
    static int months=12, days=365, years=10;
        
    public static void main(String [] args){
        double bal, rate;
        int choice = 0;

        while(true){       
            Scanner input = new Scanner(System.in);
            // prompt
            System.out.print("Enter balance: ");
            bal = input.nextDouble();
    
            System.out.print("Enter Interest rate: ");
            rate = input.nextDouble();
            
            System.out.println("Options (Enter the number for your chioce):");
            System.out.println("[1] Annual \n[2] Monthly \n[3] Daily \n[x] anything beyond the values provided will terminate the program.");              
            choice = input.nextInt();
            
            if(choice==1){ 
                double accumulator = 0;
                for(int i=0; i<years; i++){ 
                    if(i==0) accumulator=(1+(rate/(double)years));
                    accumulator*= (1+(rate/(double)years));
                }
                System.out.println("Annual "+bal*accumulator);
            }
            
            else if(choice==2){ 
                double accumulator = 0;
                for(int i=0; i<months*years; i++){ 
                    if(i==0){
                        accumulator=(1+(rate/(double)months));
                        
                    } else{accumulator*=(1+(rate/(double)months));}
                }
                System.out.println("Monthly "+bal*accumulator);
            }
            
            else if(choice==3){
                double accumulator = 0;
                for(int i=0; i<days*years; i++){ 
                    if(i==0){ 
                        accumulator=(1+(rate/(double)days));
                        
                    }else{accumulator*=(1+(rate/(double)days));}
                }
                System.out.println("Daily "+bal*accumulator);
            } else{ break;}
        }
    }
}