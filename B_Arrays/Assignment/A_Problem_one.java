package Assignment;
/*
Given an integer array nums, return true if any value appears atleast twice in array 
and return false if elements are distincts.
*/
public class A_Problem_one {
    public static boolean Solution(int arr[]){
        for(int i =0; i<arr.length-1;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5};
        System.out.println(Solution(arr));
        
    }
}
