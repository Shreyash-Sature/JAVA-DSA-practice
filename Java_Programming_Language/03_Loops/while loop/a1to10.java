import java.util.*;
public class a1to10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int counter =1;
        System.out.print("Enter your number : ");
        int num = sc.nextInt();

        while(counter <=num){
            System.out.print(counter+" ");
            counter++;
        }
    }
    
}
