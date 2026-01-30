/*
Sub Arrays : a continuous part of an array.
eg : arr[] = {1,2,3,4,5};

arrr[] = {2,3,4} is subarray
arra[] = {2,3,5} is not a subarray. 
*/
import java.util.*;
public class I_SubArrays {

    public static void SubArrays(int arr[]){
        for(int i =0; i<=arr.length-1;i++){
            for(int j = i; j<arr.length;j++){
                for(int k =i;k <=j; k++ ){ 
                    System.out.print(arr[k]);
                }
                System.out.print("      ");

            }
            System.out.println("");

        }
    }
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5};
        SubArrays(arr);
    }
    
}
/*
1      12      123      1234      12345      
2      23      234      2345      
3      34      345      
4      45      
5      
 */
