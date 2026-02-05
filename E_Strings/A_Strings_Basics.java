// Strings are immutable.

import java.util.*;
public class A_Strings_Basics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter 1st name : ");
        String str = sc.next(); // takes only one word as input and not complete line.
        System.out.println("name 1 : " + str);

        sc.nextLine();

        System.out.print("Enter second name : ");
        String name = sc.nextLine(); // takes a complete line as input.
        System.out.println("name 2 : " + name);

        // length of String
        int str_length = name.length();
        System.out.println("Length of second name is "+str_length);

        //concatination : do strings ko jodna

        String firstName = "Shreyash";
        String lastName = "Sature";

        String fullName = firstName + " " + lastName;
        System.out.println("Concatinated Strings are : "+fullName);

        // charAt(index) method;
        System.out.println("Character at index 1 is "+ fullName.charAt(1));
        
    }
    
}