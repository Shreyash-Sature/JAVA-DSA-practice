public class B_Selection_Sort {
    public static void SelectionSort(int arr[]){
        
        for(int i =0;i<arr.length-1;i++){
            int small = Integer.MAX_VALUE;
            for(int j =i+1;j<arr.length;j++){
                
                if(arr[j]<small){
                    small = arr[j];

                    int temp = arr[i];
                    arr[i]=small;
                    arr[j]=temp;
                }
                
            }
        }
        for(int i =0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {4,2,8,3,9};
        SelectionSort(arr);
    }
}
