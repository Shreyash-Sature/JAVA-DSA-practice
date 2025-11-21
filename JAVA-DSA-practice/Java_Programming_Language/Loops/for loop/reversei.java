import java.util.*;
public class reversei{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your 4 digit number : ");
        int num = sc.nextInt();
        int rev=0;
        
        for(int i = 1; i<=4; i++){
            int lastdig = num % 10;
            rev = (rev * 10) + lastdig;
            num = num/10;
        }
        System.out.print(rev);
    }
}