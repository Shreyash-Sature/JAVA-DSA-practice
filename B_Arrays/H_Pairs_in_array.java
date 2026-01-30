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
/*
(1,2) (1,3) (1,4) (1,5) (1,6) (1,7) (1,8) 
(2,3) (2,4) (2,5) (2,6) (2,7) (2,8) 
(3,4) (3,5) (3,6) (3,7) (3,8) 
(4,5) (4,6) (4,7) (4,8) 
(5,6) (5,7) (5,8) 
(6,7) (6,8) 
(7,8) 
Total number of pairs are : 28
 */