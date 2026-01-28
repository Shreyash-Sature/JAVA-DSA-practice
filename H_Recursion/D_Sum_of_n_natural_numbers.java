import java.util.*;
public class D_Sum_of_n_natural_numbers {
    // public static int Sum(int n){
    //     if (n==1){
    //         return 1;
    //     }
    //     int Sum = n + Sum(n-1);
    //     return Sum;
    // }
    public static int Sum(int n){
        if(n==1){
            return 1;
        }
        int Sum = n + Sum(n-1);
        return Sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Sum(n));

    }
    
}
