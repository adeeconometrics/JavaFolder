package Exceptions;

public class ThrowDemo {
    public static void main(String args[]){
        String input = "invalid input";
        try{
            if(input.equals("invalid input")){
                throw new RuntimeException("throw demo"); // forcibly throws exception
            } else{
                System.out.println("After throwing");
            }
        }catch(RuntimeException e){
            System.out.println("Exception caught here");
            System.out.println(e);
        }
    }
}
