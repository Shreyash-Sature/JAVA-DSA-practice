import java.util.*;
public class Brek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
         
        do{
            int n = sc.nextInt();
            if(n % 10 ==0){
                break;
            }
            System.out.println(n);
        }while(true);
        
    }

}