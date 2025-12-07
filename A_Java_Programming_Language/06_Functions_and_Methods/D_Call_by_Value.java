/*
Call by Value : Any changes made inside the method do NOT affect the original variable (for primitive types).

In Java, all method arguments are passed using call by value 
— meaning a copy of the value is sent to the method, not the original variable itself.
*/


public class D_Call_by_Value {
    public static int changeNum(int a){
        a = 2;
        return a;  //modifies only copy
    }
    public static void main(String[] args) {
        int a = 1;
        changeNum(a);
        System.out.println(a); // value of a remains same 

    }
    
}
