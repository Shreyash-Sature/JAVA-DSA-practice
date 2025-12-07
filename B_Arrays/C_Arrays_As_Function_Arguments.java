/*
Arrays are objects in Java, so when we pass an array to a method,
 we actually pass the reference (address) of the array — not a copy.

 Means: Changes made inside the function affect the original array(in main function).
*/

public class C_Arrays_As_Function_Arguments {

    public static void update_array(int arr[], int nonChangable){

        nonChangable =10;

        for(int i=0; i<arr.length;i++){
            arr[i] = arr[i] +1;
        }
    }

    public static void main(String[] args) {
        int nonChangable = 5;
        int arr[] ={11,12,76};

        update_array(arr,nonChangable);

        for(int i =0; i<arr.length;i++){
            System.out.print(arr[i] + " "); // Arrays are passed by reference hence value changes in main function
        }
        System.out.println(" ");

        System.out.println(nonChangable);  // Passed by value hence doesnt change
    }

    
}
