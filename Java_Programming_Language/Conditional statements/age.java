import java.util.*;

public class age{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enetr your age : ");
        int age = sc.nextInt();
        
        if(age >=18){
            System.out.println("Your are adult.");

        }
        else{
            System.out.println("Your are not adult.");
        }
    }
}