import java.util.*;

public class G_calci{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enetr your number a :");
        int a = sc.nextInt();
        System.out.print("Enetr your number b :");
        int b = sc.nextInt();
        int sum = a+b;
        int prod = a*b;

        System.out.print("Sum of a and b is : ");
        System.out.println(sum);

        System.out.print("Product of a and b is : ");
        System.out.println(prod);
        
    }
}