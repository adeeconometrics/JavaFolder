class Animal{
    public void eat(){
        System.out.println("I'm eating.");
    }
    public void sleep(){
        System.out.println("I'm sleeping.");
    }
}

class Mammal extends Animal{
    public void controlTemp(){
        System.out.println("Control temp from Mammal.");
    }
}

class Lion extends Mammal{
    public void roar(){
        System.out.println("I'm a Lion. Roaar!");
    }
}

public class CastingClass {
    public static void main(String args[]){
        Animal animal_ref  = new Lion(); // super class can make references to subclasses as long as it points to the specific subclass it can be downcasted. 
        // animal_ref.roar() is not accessible since Animal class do not have roar() method
       ((Lion)animal_ref).roar(); // this syntax is necessary for downcasting 
    }
}
