import java.util.*;
public class reverse{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your four digit number : ");
        int num = sc.nextInt();
        for (int i=1; i<=4; i++){
            int j = num%10;
            num = num/10;
            System.err.print(j);
        }
    }
}