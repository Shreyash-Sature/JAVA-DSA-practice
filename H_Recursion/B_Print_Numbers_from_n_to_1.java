import java.util.*;
public class B_Print_Numbers_from_n_to_1{

    public static void printNum(int n){

        if(n==1){
            System.out.println(n);
            return;
        }

        System.out.print(n +" ");
        printNum(n-1);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num : ");
        int n = sc.nextInt();
        printNum(n);

    }
}