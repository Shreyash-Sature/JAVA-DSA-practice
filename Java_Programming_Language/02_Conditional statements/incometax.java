import java.util.*;
public class incometax {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your income : ");

        double income = sc.nextInt();
        
        if(income < 500000){
            int tax = 0;
            System.out.println("Tax you have to pay is " + tax + " Rs.");
        }
        else if (income >=500000 && income < 1200000){
            double tax = income * 0.2;
            System.out.println("Tax you have to pay is " + tax + " Rs.");

        }
        else if (income >=1200000 && income <7000000){
            double tax = income * 0.3;
            System.out.println("Tax you have to pay is " + tax + " Rs.");

        }
        else{
            double tax = income * 0.4;
            System.out.println("Tax you have to pay is " + tax + " Rs.");

        }
    }
    
}
