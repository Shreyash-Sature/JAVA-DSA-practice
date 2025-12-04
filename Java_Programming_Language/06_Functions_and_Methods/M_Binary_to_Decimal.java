

import java.util.*;
public class M_Binary_to_Decimal {

    public static void Bin_to_Dec(int n){
        double deci = 0;
        int i =0;
        while(n>0){
            
            int last_dig = n%10;
            deci = deci + last_dig*Math.pow(2,i);
            n = n/10;
            i++;

        }
        System.out.println(deci);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter binary number :");
        int n = sc.nextInt();
        Bin_to_Dec(n);
    }
    
}
