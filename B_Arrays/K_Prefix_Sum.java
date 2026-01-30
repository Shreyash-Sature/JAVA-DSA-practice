import java.util.Scanner;

/*
Prefix sum array : is an array that stores the sum of subarrays staring from index 0.
*/

public class K_Prefix_Sum {
    public static void SubArr_Sum(int arr[]){
        int prefix_sum[] = new int [arr.length];
        prefix_sum[0]=arr[0];
        int max_sum = Integer.MIN_VALUE;
        for(int i=1;i<arr.length;i++){
            prefix_sum[i]= prefix_sum[i-1]+arr[i];
        }
        
        for(int start =0;start<arr.length;start++){
            for(int end = 1;end<arr.length;end++){
                int sum = prefix_sum[end]-prefix_sum[start];
                if(max_sum< sum){
                    max_sum =sum;
                }
            }
        }
        System.out.println("Maximum sum is : " + max_sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,-2,3,4,-5,6};
        SubArr_Sum(arr);

    }
}
