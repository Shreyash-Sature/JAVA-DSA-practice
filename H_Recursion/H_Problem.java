public class H_Problem {
    public static int LastOccurance(int arr [], int key, int i){
        int isFound = LastOccurance(arr, key, i+1);
        if(isFound == -1 && arr[i]==key){
            return i;
        }
        return isFound;
    }
    public static void main(String[] args) {
        int arr[] ={1,2,3,2,1,5,7,3,9};
        System.out.println(LastOccurance(arr, 3, 0)); 
    }
}
