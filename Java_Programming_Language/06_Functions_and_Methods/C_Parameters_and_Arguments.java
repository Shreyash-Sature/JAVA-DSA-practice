/*
 parameters : writen in function definition are called as parameters or formal parameters

 arguments  : Value passed in function call is called as argument
*/

import java.util.*;
public class C_Parameters_and_Arguments {
    public static int calc_Sum(int num1, int num2){    // parameters or formal parameters
        int sum = num1 + num2;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int sum = calc_Sum(a,b);        // Arguments or actual parameters
        System.out.println("Sum is : "+ sum);
    }


    
}
