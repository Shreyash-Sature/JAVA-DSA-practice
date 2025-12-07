/*
Type Conversion: Happens when 
   a) type compatible
   b)destination type > source type

   byte -> short -> int ->float -> long -> double
   (long cant be converted into int but int can be converted into long)

   characters can be converted into numbers ('a'-> int)
                char a = 'A';
                int b = a;
 */

import java.util.*;
public class H_TypeConversion {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a :");
        int a = sc.nextInt();

        long b = a;
        System.out.print(b);

        
    }
    
}
