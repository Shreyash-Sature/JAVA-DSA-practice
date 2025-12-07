import java.util.*;
public class L_Prime_In_Range {

    public static boolean is_Prime(int n){
        boolean is_Prime =true;
        for(int i =2; i<= Math.sqrt(n);i++){
            if(n%i ==0){
                is_Prime = false;
            }
        }
        return is_Prime;
    }
    public static void print_Prime(int n){
        for (int i =2; i<=n;i++){
            if(is_Prime(i)==true){
                System.out.print(i +" ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter number :");
        int n = sc.nextInt();
        print_Prime(n);

    }
    
}
