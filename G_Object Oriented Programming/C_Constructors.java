/*
Constructors : are special type of methods used to initialize an object and are invoked
               automatically at time of object creation.
    - has same name as class
    - memormy allocation is done when constructor is called
    - don't have return type (not even void)
    - called only once at time of object creation
    - */
public class C_Constructors {
    public static void main(String[] args) {
        Student s1 = new Student();
    }
}
class Student{
    String name;
    int roll_no;

    Student(){
        System.out.println("Constructor is called....");
    }
}