/*
Forcefully converting data types with loss of data 
*/

import java.util.*;
public class I_TypeCasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        float a = sc.nextFloat();

        int b = (int)a;

        // float a = 23.43f;
        // int b = (int) a;

        System.out.println(b);
    }
    
}
