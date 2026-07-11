/*
Inheritance allows one class to acquire the properties (variables) and behaviors (methods) of another class. 
Inheritance is the mechanism by which one class inherits the fields and methods of another class 
using the extends keyword.
*/
class Animal{
    void eats(){
        System.out.println("Eats.");
    }
    void breaths(){
        System.out.println("Breaths");
    }
}
class Dog extends Animal{
    void barks(){
        System.out.println("Barks");
    }
}
public class E_Inheritance {
    public static void main(String[] args) {
        Dog Moti = new Dog();
        Moti.barks();
        Moti.breaths();
    }

}
