/*
Function Overloading : Multiple functions with same name but different type of parameters or 
                       different no. of parameters. 
*/

import java.util.*;
public class I_Function_Overloading {

    public static int sum (int a, int b){
        return a + b;

    }
    public static int sum(int a, int b, int c){
        return a + b +c;

    }
    public static double sum(double a, double b){
        return a + b;

    }
    public static void main(String[] args) {
        System.out.println(sum(2.3,4.2));
        System.out.println(sum(2,4));
        System.out.println(sum(2,4,5));
    }
}
