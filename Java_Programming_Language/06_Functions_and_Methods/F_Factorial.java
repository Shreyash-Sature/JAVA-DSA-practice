import java.util.*;
public class F_Factorial {

    public static int factorial(int num){
        int fact =1;
        for (int i =1; i<=num;i++){
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to find its factorial : ");
        int num = sc.nextInt();

        int fact =factorial(num);
        System.out.println("Factorial of given number is : "+fact);  
    }
    
}
