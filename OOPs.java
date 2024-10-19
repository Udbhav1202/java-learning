

 
public class OOPs {
    public static void main(String[] args) {
        fish shark = new fish();
        shark.eat();
    }
}

class Pen {
    String color;
    int tip;  

    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}

class Students{
    String name;
    int age;
    float cgpa;

    void calCgpa(int math, int phy, int chem){
        cgpa = (math+phy+chem)/3;
    }

    void calage(int curryear, int bornyear){
        age = curryear-bornyear;
    }

}
class animal {
    String color;
    void eat () {
        System.out.println("eats");

    }
    void breathe(){
        System.out.println("breathe");
    }
}

class fish extends animal{
    int fins;
    void swim(){
        System.out.println("swim");
    }
}

class Student {
    String name;
    int roll;
    int marks[];

    Student () {

    }

    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        this.marks = s1.marks;
    }
    
}
