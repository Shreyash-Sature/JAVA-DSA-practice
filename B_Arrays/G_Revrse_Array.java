import java.util.*;
//Time complexity = O(n); (n/2 iterations takes place)
//Space complexity = O(1); (Swapping in same array is done hence no extra space is used )


public class G_Revrse_Array {
    // Using For LOOP (same as while loop but while is prefered )
    public static void Reverse_Array(int arr[]){
        for(int i =0; i<=(arr.length-1)/2;i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
        for(int i =0; i<arr.length;i++){
            System.out.print(arr[i]+", ");
        }
    }
    // Using while loop (prefered)
    public static void Reverse_Arr(int prr[]){
        int start =0, end = prr.length-1;
        while(start < end){
            int temp = prr[start];
            prr[start] = prr[end];
            prr[end] = temp;
            start++;
            end--;
        }
        System.out.println("");
        for(int i =0; i<prr.length;i++){
            System.out.print(prr[i]+", ");
        }

    }

    
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int prr[] = {1,2,3,4,5,6,7,8,9};
        Reverse_Array(arr);
        Reverse_Arr( prr);
    }
    
}
