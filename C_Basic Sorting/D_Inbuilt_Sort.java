import java.util.*;

public class D_Inbuilt_Sort {

    public static void InbuiltSort(Integer arr[]) {
        Arrays.sort(arr, Collections.reverseOrder());

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        Integer arr[] = {1, 5, 3, 4, 8};

        // Ascending sort
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        // Descending sort
        InbuiltSort(arr);
    }
}
