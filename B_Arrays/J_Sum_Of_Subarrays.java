import java.util.*;
public class J_Sum_Of_Subarrays {
    public static void SubArr_Sum(int arr[]){
        // int final_sum =0;
        // int summ[]=new int[arr.length];
        // for(int i =1; i<arr.length;i++){
        //     int sum_all =0;
        //     for(int j =i;j<arr.length;j++){
        //         int sum = 0;
        //         for(int k=i;k<=j;k++){
        //             System.out.print(arr[k-1]+", ");
        //             sum += arr[k];
        //         }
        //         System.out.println("");
        //         int max_sum = Integer.MIN_VALUE;
        //         if(max_sum<sum){
        //             max_sum =sum;
        //         }
        //         summ[i]= max_sum;
        //     }
        //     System.out.println(" ");
        //     int max_sum = Integer.MIN_VALUE;
        //     for(int m=0;m<arr.length-1;m++){
                
        //         if(max_sum < summ[m]){
        //             max_sum = summ[m];
        //         }
        //     }
        //     System.out.println("SubArray with maximum sum is : " + max_sum);
        // }
        int sum =0;
        int max_sum = Integer.MIN_VALUE;
        for(int i=0;i<=arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k =i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                    sum = sum + arr[k];
                }
                System.out.println();
                System.out.println("Sum = "+ sum);
                if(sum > max_sum){
                    max_sum = sum;
                }
                sum =0;
                
            }
        }
        System.out.println("Max sum from all subarrays is "+ max_sum);
                
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,-2,3,4,-5,6};
        SubArr_Sum(arr);

    }
    
}
