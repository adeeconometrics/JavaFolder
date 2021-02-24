// abstract class -> define and declare methods
// interfaces can only declare methods until 1.8 where default keyword is introduced, also static methods can be made in interfaces
// Default methods enable you to add new functionality to the interfaces of your 
// libraries and ensure binary compatibility with code written for older versions of those interfaces (https://bityl.co/5fhx).


interface A{
    default void show(){
        System.out.println("Printed from A");
    }
}

interface B{
    default void printB(){
        System.out.println("print method in b");
    }

    default void show(){
        System.out.println("Printed from B");
    }

}
// for disambiguating methods 
class AB implements A, B{
    @Override
    public void show(){
        B.super.show();
        A.super.show();
    }
}


public class InterfaceDemo{
    public static void main(String [] args){
        AB ab = new AB();
        ab.show();
    }
}