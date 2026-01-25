import java.util.*;
public class E_Fibonacci{
    public static int Fibo(int n){
        if(n==0 || n==1){
            return n;
        }
    
        int num = Fibo(n-1) + Fibo(n-2);
        return num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Fibo(n));
    }

}