import java.util.*;
public class PrintNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter =0;
        while(counter <=10){
            System.out.print(counter + " ");
            counter++;
        }

        
        System.out.print("Enter number to where number to be printed : ");
        int n = sc.nextInt();

        while(counter <= n){
            System.out.print(counter + " ");
            counter++;
        }
        
    }
    
}
