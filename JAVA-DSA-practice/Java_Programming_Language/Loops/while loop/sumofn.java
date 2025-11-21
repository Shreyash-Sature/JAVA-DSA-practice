import java.util.*;
public class sumofn {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your number : ");
        int n = sc.nextInt();
        int i = 0; //i = iterator
        int sum = 0;

        while(i<=n){
            sum = sum + i;
            i++;
            
        }
        System.out.print("Sum of 1st "+n+" natural numbers is "+sum);

    }
    
}
