public class H_Pairs_in_array {
    public static void Array_Pairs(int arr[]){
        int tot_pairs =0;
        for(int i=0;i<=arr.length-2;i++){
            for(int j = i+1;j<=arr.length-1;j++){
                System.out.print("("+arr[i] + "," +arr[j] + ") ");
                tot_pairs++;
            }
            System.out.println("");
            
        }
        System.out.println("Total number of pairs are : "+ tot_pairs);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        Array_Pairs(arr);
    }
    
}
