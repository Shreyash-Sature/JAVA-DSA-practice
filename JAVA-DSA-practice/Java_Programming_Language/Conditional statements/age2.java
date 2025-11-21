import java.util.*;
public class age2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = sc.nextInt();

        if(age>=18 && age<110){
            System.out.println("Your are an adult.");
        }
        else if(age>=110 || age<=0){
            System.out.println("Enter valid age.");
        }
        else if(age>=13 && age<18){
            System.out.println("Your are a teenager.");
        }
        
        else{
            System.out.println("Your are a child.");
        }
        
    }
    
}
