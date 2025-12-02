package Concepts;
/* 
 Switch Statements : 

 switch (variable) {
 case 1 :
 case 2 :
 case 3 :
 case 4 :
 }


*/
import java.util.*;
public class SwitchStatement {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Samosa \n2.Vadapav \n3.Kachori \n4.Fruti");
        System.out.println("Enter number assigned to item to check the Price.");
        System.out.print("Enetr the number : ");
        int number = sc.nextInt();
        System.out.print("The Price of ");

        switch(number){
            case 1: System.out.println("Samosa is 20 Rs.");
            break;

            case 2: System.out.println("Vadapav is 15 Rs.");
            break;

            case 3: System.out.println("Kachori is 25 Rs.");
            break;

            case 4: System.out.println("Fruti is 10 Rs.");
            break;

            default : System.out.println("We woke up!");
        }
    }
    
    
}
