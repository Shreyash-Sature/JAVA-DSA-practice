import java.util.*;
public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting number :");
        int k = sc.nextInt();
        System.out.print("Enter last number to where numbers are added : ");
        int j = sc.nextInt();
        int i = k;

        int sum = 0;
        while(i<=j){
            sum = sum + i;
            i++;
        }
        System.out.println("Sum of numbers from "+ (k)+ " to " + j + " is : " + sum);

        
    }
    
}
