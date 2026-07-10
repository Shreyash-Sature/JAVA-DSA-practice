import java.util.ArrayList;
public class A_ArrayList {
    public static void main(String args[]){

        ArrayList<Integer> list1 = new ArrayList<>();

        // ading elements to arraylist
        list1.add(0,1);
        list1.add(33);
        list1.add(24);

        System.out.println(list1);

        list1.set(1,2);
        System.out.println("Set element 2 at index 1 " +list1);

        list1.remove(2);
        System.out.println("Removed element from index 2 "+list1);

        System.out.println(list1.contains("Checked if 22 is present in arraylist "+22));


    }
}
