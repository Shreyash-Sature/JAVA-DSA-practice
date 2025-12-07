import java.util.*;
public class E_Largest_no_in_Array {
    
    public static int largest(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]> largest){
                largest = arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Eneter Size of array : ");
        int n = sc.nextInt();
        int arr[]= new int [n];

        System.out.print("Enter elements of array : ");

        for(int i =0; i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(largest(arr) +" is the largest element in given array.");
    }
}
