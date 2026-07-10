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
        Student s1 = new Student(); // Non-parameterized constructor will be called

        Student s2 = new Student("Shreyash");// paramterized constructor will be called

        Student s3 = new Student();// Non-parameterized constructor will be called
        s3.name = "Shreya";
        s3.roll_no = 22;
        s3.password = "abcd";
        
        //copy constructor will be called
        Student s4 = new Student(s3);
        s4.password = "xyzabc";
    }
}
class Student{
    String name;
    int roll_no;
    String password;


// Non parameterized constructor
    Student(){     
        System.out.println("Constructor is called....");
    }

// parameterized constructor 
    Student(String name){  
        this.name = name;
    }

// Copy Constructor
    Student(Student objct){
        this.name = objct.name;
        this.roll_no = objct.roll_no;
    
    }
}