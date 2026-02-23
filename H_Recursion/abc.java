public class abc {
    public static boolean SortedArr(int arr[] , int idx){
        if(arr.length==0 || arr.length==1){
            return true;
        }
        if(idx == arr.length){
            return true;
        }
        if(arr[idx]<arr[idx -1]){
            return false;
        }

        return SortedArr(arr, idx+1);

        
    }
    public static void main(String[] args) {
        int arr[] = {1,3,4,2};
        int idx =1;
        System.out.println(SortedArr(arr, idx));
    }
    
}
