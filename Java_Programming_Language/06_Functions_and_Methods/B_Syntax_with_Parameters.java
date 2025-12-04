/*
returnType fun_name(type parameter1, type parameter2){ 

        //body

        return statement;
    }
    
    while calling function no need to give type of parameters in function call
    eg. calculateSum(a,b);
*/
import java.util.*;
public class B_Syntax_with_Parameters { // parameters or formal parameters

    public static int calculateSum(int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = calculateSum(a,b);//arguments
        System.out.println(sum);

        //OR

        System.out.println(calculateSum(a,b));

    }
    
}
