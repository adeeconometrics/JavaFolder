package School;

public class Student extends Person{
    float grade;

    Student(){}
    Student(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void setGrade(float grade){
        this.grade = grade;
    }

    public float getGrade(){
        return grade;
    }
}

