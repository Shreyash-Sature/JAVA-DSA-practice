/*
WAF to find the first occurance of an element in an array. 
*/

public class G_Problem {
    // public static int FirstOccurance(int arr[],int key, int i){
    //     if(i == arr.length){
    //         return -1;
    //     }
    //     if(arr[i]==key){
    //         return i;
    //     }
    //     return FirstOccurance(arr, key, i+1);
    // }

    public static int FirstOccurance(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        
        return FirstOccurance(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[] ={1,2,3,2,1,5,7,3,9};
        System.out.println(FirstOccurance(arr, 3, 0));  
 
    }
    
}
