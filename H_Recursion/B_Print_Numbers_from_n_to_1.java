import java.util.*;
public class B_Print_Numbers_from_n_to_1{
    // Decreasing order
    public static void printNumDec(int n){

        if(n==1){
            System.out.println(n);
            return;
        }

        System.out.print(n +" ");
        printNumDec(n-1);

    }
    //Increasing order 
    public static void printNumInc(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        printNumInc(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num : ");
        int n = sc.nextInt();
        printNumInc(n);

    }
}