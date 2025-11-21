import java.util.*;
public class Calculator {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number a : ");
        int a = sc.nextInt();
        System.out.print("Enter operator : ");
        char operator = sc.next().charAt(0);
        System.out.print("Enter number b : ");
        int b = sc.nextInt();
        

        switch(operator){
            case '+' : System.out.println(a+b);
            break;

            case '-' : System.out.println(a-b);
            break;

            case '/' : System.out.println(a/b);
            break;

            case '*' : System.out.println(a*b);
            break;

            default : System.out.println("You Entered wrong operator!");
        }
    }
    
}
