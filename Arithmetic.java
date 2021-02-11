/**
 * @author: Dave Arthur D. Amiana
 * Description: method overloading for Arithmetic object
 */
public class Arithmetic{
    int add(int a1, int a2){
        return a1 + a2;
    }
    int add(int a1, int a2, int a3){
        return a1 + a2+ a3;
    }
    int add(int a1, int a2, int a3, int a4){
        return a1 + a2 + a3 + a4;
    }

    int multiply(int a1, int a2){
        return a1 * a2;
    }
    int multiply(int a1, int a2, int a3){
        return a1 * a2 * a3;
    }
    int multiply(int a1, int a2, int a3, int a4){
        return a1 * a2 * a3 * a4;
    }

    int subtract(int a1, int a2){
        return a1 - a2;
    }

    int divide(int a1, int a2){
        return a1 / a2;
    }

    public static void main(String [] args){
        Arithmetic self = new Arithmetic();

        System.out.print(" add(1,3): ");
        System.out.println(self.add(1,3));

        System.out.print(" add(1,3,4,5): ");
        System.out.println(self.add(1,3,4,5));

        System.out.print(" multiply(2,3,4): ");
        System.out.println(self.multiply(2,3,4));

        System.out.print(" multiply(1,1): ");
        System.out.println(self.multiply(1,1));

        System.out.print(" subtract(3,1): ");
        System.out.println(self.subtract(3,1));

        System.out.print(" divide(5,2): ");
        System.out.println(self.divide(5,2));
    }

}