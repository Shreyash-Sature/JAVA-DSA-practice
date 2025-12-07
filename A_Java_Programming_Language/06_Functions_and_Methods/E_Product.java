import java.util.*;
public class E_Product {

    public static int prod(int num1, int num2){
        int prod = num1 * num2;
        return prod;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(prod(a,b));
        

    }

    
}
