import java.util.*;
public class ArrayList1 {

    
    
    public static void main(String[] args){
        ArrayList <Integer> list = new ArrayList<>();

        // add function
        for (int i =1; i<=5; i++){
            list.add(i);
        }
        System.out.println("List : "+list);

        //size of array 
        int size = list.size(); //use size() function not length() for arraylist
        System.out.println("Size : "+size);

        // get function 
        int element = list.get(2);

        System.out.println("Element at index 2 :"+element);

        // delete element
        list.remove(2);
        System.out.println(list);

        //set element at indedx 
        list.set(2,9);
        System.out.println(list);

        //check if element exists
        System.out.println(list.contains(9));

        //Reverse ArrayList
        ReverseArrayList(list);
        //MinMax Elements in arraylist
        MinMaxArrayList(list);
        //Swap Two Numbers
        SwaptwoNums(list, 1,2);

     }
     
     
     // Revrse the ArrayList
    public static void ReverseArrayList(ArrayList<Integer> list){
        System.out.print("Reversed ArrayList : ");
        for(int i = list.size()-1; i>=0; i--){
            System.out.print(list.get(i)+" ");
        }
    }

    // maximum num in ArrayList
    public static void MinMaxArrayList(ArrayList<Integer> list){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0; i<list.size(); i++){
            if(list.get(i)>max){
                max = list.get(i);
            }
            if(list.get(i)<min){
                min = list.get(i);
            }
        }
        System.out.println("Maximum element in list is "+max);
        System.out.println("Minimum element in list is "+min);
    }

    //Swap two numbers
    public static void SwaptwoNums(ArrayList<Integer> list, int idx1, int idx2){
        int temp = list.get(idx1);
        list.set(idx1,list.get(idx2)) ;
        list.set(idx2 , temp);
        System.out.println(list);

    }
}
