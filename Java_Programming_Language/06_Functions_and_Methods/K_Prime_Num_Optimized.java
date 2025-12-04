/*
Loop runs from 2 to under root n
 */

public class K_Prime_Num_Optimized {
    public static boolean is_Prime(int n){
        boolean is_Prime =true;
        for(int i =2; i<= Math.sqrt(n);i++){
            if(n%i ==0){
                is_Prime = false;
            }
        }
        return is_Prime;
    }
    public static void main(String[] args) {
        System.out.println(is_Prime(5));
    }
    
}
