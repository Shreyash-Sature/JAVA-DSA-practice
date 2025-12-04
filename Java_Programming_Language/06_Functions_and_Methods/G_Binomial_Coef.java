import java.util.*;
public class G_Binomial_Coef {

    public static int factorial(int num){
        int fact =1;
        for (int i =1; i<=num;i++){
            fact = fact * i;
        }
        return fact;
    }

    public static int Bino_Coef(int n, int r){
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int n_r_fact = factorial(n-r);

        int Bino_Coef = n_fact /(r_fact * n_r_fact);

        return Bino_Coef;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter value of n :");
        int n = sc.nextInt();
        System.out.print("Enter value of r :");
        int r = sc.nextInt();

        int Bino_Coef = Bino_Coef(n,r); // function call 
        System.out.println("Binomial Coefficient is : " + Bino_Coef);
    }

}
