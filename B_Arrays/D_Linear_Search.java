public class D_Linear_Search {

    public static void Linear_Search(int arr[], int key){
        for(int i=0; i < arr.length; i++){
            if(arr[i] == key){
                System.out.println("Key found at index " + i);
            }
            else{
                System.out.println("Key not found.");
            }
        }
    }
    public static void main(String[] args) {
        int arr [] ={1,2,3,4,5,7,8,9};
        int key =5;

        Linear_Search(arr,key);
    }
    
}
