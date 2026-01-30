// import java.util.*;
// public class F_Binary_Search {
//     public static int Binary_Search(int arr[],int key){
//         int start = 0;
//             int end = arr.length-1;
        
//         while(start<=end){
            
//             int mid =(start + end)/2;
//             if(arr[mid] == key){
//                 return mid;
//             }
//             else if(arr[mid]<key){
//                 start = mid+1;
//             }
//             else if(arr[mid]>key){
//                 end = mid-1;
//             }
//             else{
//                 System.out.println("Key doesnt exist in array.");
//             }
            
//         }
//         return -1;
        
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter the key to be searched : ");
//         int key = sc.nextInt();
//         int arr[] ={2,3,4,6,8};

//         System.out.println("Key found at index : " + Binary_Search(arr, key));
//     }
    
// }

import java.util.*;
public class F_Binary_Search {
    public static int Binary_Search(int arr[], int key){
        int start =0;
        int end =arr.length-1;
        
        while(start <= end){
            int mid = (start + end)/2;
            if(arr[mid]==key){
                System.out.println("Key found at index " + mid);
                return mid;
            }
            else if(arr[mid]<key){
                start = mid +1;
            }
            else if(arr[mid]>key){
                end = mid -1;
            }
        }
        System.out.println("Key doesnt exist in given array.");
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] ={11,12,23,37,43,45,56,87,90};
        System.out.print("enter key to search : ");
        int key = sc.nextInt();

        Binary_Search(arr,key);
}
}
