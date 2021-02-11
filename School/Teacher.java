package School;

public class Teacher extends Person{
    int salary;
    Teacher(){}
    Teacher(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

    public int getSalary(){
        return salary;
    }
}
