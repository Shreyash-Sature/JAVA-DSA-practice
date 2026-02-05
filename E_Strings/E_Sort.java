/*
Sort the array of strings in alphabetical order
*/
public class E_Sort {
    public static void Sort(String fruits[]){
        
        for(int i =0; i<fruits.length-1;i++){
            for(int j =i+1;j<fruits.length;j++)
            if (fruits[i].compareTo(fruits[j]) >0){
                String temp = fruits[i];
                fruits[i] = fruits[j];
                fruits[j] = temp;

            }
            System.out.println(fruits[i]+" ");
        }
        System.out.println(fruits[fruits.length-1]);
        
    }
    public static void main(String[] args) {
        String fruits[] = {"apple", "banana", "papaya","mango"};
        Sort(fruits);
    }
}
