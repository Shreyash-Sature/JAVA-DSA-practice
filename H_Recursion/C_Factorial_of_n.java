import java.util.*;
public class C_Factorial_of_n {

    public static int Factorial(int n){
        if(n==0){
            return 1;
        }
        int fact = n * Factorial(n-1);
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Factorial(n));

    }
}
