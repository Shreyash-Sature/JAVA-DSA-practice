package Concepts;
/*
 Ternary Operator :
 variable = condition? statement1 : statement2;

 (if condition is true the execute statement1 otherwise execute statement2 
 and the value returened by the statement is stored in variable )

*/

import java.util.*;
public class ternaryOperator{

    
    public static void main(String[]args){
        
        Scanner sc = new Scanner(System.in);
        int larger = (5>3)? 5:3;
        System.out.println(larger);

        String type = (25 % 2 == 0) ? "Even" : "Odd" ;
        System.out.println(type);

        
        System.out.print("Enter marks : ");
        int marks = sc.nextInt();
        String result = (marks >=33)?"Pass" : "Fail";
        System.out.println(result);
    }
}