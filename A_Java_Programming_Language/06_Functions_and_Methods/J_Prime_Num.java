import java.util.*;
public class J_Prime_Num {
    public static boolean is_Prime(int n){
        boolean is_Prime = true;
        if(n == 2) return true;
        for(int i =2;i<=n-1;i++){
            if(n % i ==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        System.out.println(is_Prime(n));
        
    }
    
}
