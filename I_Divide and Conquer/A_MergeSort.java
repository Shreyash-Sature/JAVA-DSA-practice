public class A_MergeSort {
    public static void mergeSort(int arr[], int si, int ei){
        if(si >= ei){
            return;
        }
        int mid = si + (ei-si)/2;

        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);
        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si,int mid, int ei){
        int i = si;
        int j = mid +1;
        int k = 0;
        int temp[] = new int[ei-si +1];

        while(i<=mid && j<=ei){
            if(arr[i] >= arr[j]){
                temp[k] = arr[j];
                j++;
            }
            else{
                temp[k] = arr[i];
                i++;
            }
            k++;
            
        }
        while(i<= mid){
            temp[k++] = arr[i++];
        }
        while(j <=ei){
            temp[k++] =arr[j++];
        }
            // copy temp arr to main arr
        for(k=0, i = si; k<temp.length; i++){
            arr[i] = temp[k];
            k++;
        }
    }

    public static void printArr(int arr[]){
        for (int i =0; i<arr.length ; i++){
            if(i == arr.length-1){
                System.out.println(arr[i]+" }");
            }
            else if(i == 0){
                System.out.print(" { ");
            }
            else{
                System.out.print(arr[i]+", ");
            }
            
        }
    }

    public static void main(String arg[]){
        int arr[] ={6,3,9,5,2,8};
        mergeSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}
